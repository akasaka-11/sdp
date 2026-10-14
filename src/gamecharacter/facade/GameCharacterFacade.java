package gamecharacter.facade;

import gamecharacter.model.CharacterClass;
import gamecharacter.subsystem.CharacterProfile;
import gamecharacter.subsystem.CharacterRepository;
import gamecharacter.subsystem.InventoryService;
import gamecharacter.subsystem.NameValidator;
import gamecharacter.subsystem.SkillTreeBuilder;
import gamecharacter.subsystem.StatAllocator;
import gamecharacter.subsystem.Stats;

import java.util.List;


public class GameCharacterFacade {
    private static final int STARTING_LEVEL = 1;

    private final NameValidator nameValidator;
    private final StatAllocator statAllocator;
    private final SkillTreeBuilder skillTreeBuilder;
    private final InventoryService inventoryService;
    private final CharacterRepository repository;

    public GameCharacterFacade() {
        this(new InventoryService());
    }

    public GameCharacterFacade(InventoryService inventoryService) {
        this.nameValidator = new NameValidator();
        this.statAllocator = new StatAllocator();
        this.skillTreeBuilder = new SkillTreeBuilder();
        this.inventoryService = inventoryService;
        this.repository = new CharacterRepository();
    }

    public CharacterSummary createCharacter(String name, CharacterClass characterClass)
            throws CharacterCreationException {
        validateRequest(name, characterClass);
        reserveName(name);
        try {
            CharacterProfile profile = buildNewProfile(name, characterClass);
            repository.save(profile);
            return toSummary(profile);
        } catch (RuntimeException e) {
            repository.releaseName(name);
            throw new CharacterCreationException("Could not create character '" + name + "': " + e.getMessage(), e);
        }
    }

    public CharacterSummary levelUp(String name) throws CharacterCreationException {
        CharacterProfile current = findOrFail(name);
        int newLevel = current.level() + 1;
        Stats stats = statAllocator.allocate(current.characterClass(), newLevel);
        List<String> skills = skillTreeBuilder.unlockedSkills(current.characterClass(), newLevel);
        CharacterProfile leveled = new CharacterProfile(current.name(), current.characterClass(), newLevel,
                stats, skills, current.items());
        repository.save(leveled);
        return toSummary(leveled);
    }

    public CharacterSummary viewCharacter(String name) throws CharacterCreationException {
        return toSummary(findOrFail(name));
    }

    private CharacterProfile findOrFail(String name) throws CharacterCreationException {
        return repository.find(name)
                .orElseThrow(() -> new CharacterCreationException("Character '" + name + "' does not exist"));
    }

    private void validateRequest(String name, CharacterClass characterClass) throws CharacterCreationException {
        if (characterClass == null) {
            throw new CharacterCreationException("A character class is required");
        }
        try {
            nameValidator.validate(name);
        } catch (IllegalArgumentException e) {
            throw new CharacterCreationException("Invalid name: " + e.getMessage(), e);
        }
    }

    private void reserveName(String name) throws CharacterCreationException {
        try {
            repository.reserveName(name);
        } catch (IllegalStateException e) {
            throw new CharacterCreationException(e.getMessage(), e);
        }
    }

    private CharacterProfile buildNewProfile(String name, CharacterClass characterClass) {
        Stats stats = statAllocator.allocate(characterClass, STARTING_LEVEL);
        List<String> skills = skillTreeBuilder.unlockedSkills(characterClass, STARTING_LEVEL);
        List<String> items = inventoryService.starterKit(characterClass);
        return new CharacterProfile(name, characterClass, STARTING_LEVEL, stats, skills, items);
    }

    private CharacterSummary toSummary(CharacterProfile p) {
        return new CharacterSummary(p.name(), p.characterClass().name(), p.level(),
                p.stats().health(), p.stats().mana(), p.skills(), p.items());
    }
}