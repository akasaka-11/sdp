package gamecharacter.subsystem;

import gamecharacter.model.CharacterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SkillTreeBuilder {

    private record Skill(String name, int requiredLevel) {
    }

    private static final Map<CharacterClass, List<Skill>> SKILLS = Map.of(
            CharacterClass.WARRIOR, List.of(
                    new Skill("Slash", 1), new Skill("Shield Bash", 2), new Skill("Battle Cry", 4)),
            CharacterClass.MAGE, List.of(
                    new Skill("Fireball", 1), new Skill("Frost Nova", 3), new Skill("Arcane Surge", 5)),
            CharacterClass.ARCHER, List.of(
                    new Skill("Quick Shot", 1), new Skill("Poison Arrow", 2), new Skill("Rain of Arrows", 4)));

    public List<String> unlockedSkills(CharacterClass characterClass, int level) {
        List<String> unlocked = new ArrayList<>();
        for (Skill skill : SKILLS.get(characterClass)) {
            if (skill.requiredLevel() <= level) {
                unlocked.add(skill.name());
            }
        }
        return unlocked;
    }
}