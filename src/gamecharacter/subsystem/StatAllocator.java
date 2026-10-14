package gamecharacter.subsystem;

import gamecharacter.model.CharacterClass;

public class StatAllocator {

    public Stats allocate(CharacterClass characterClass, int level) {
        Stats base = baseStats(characterClass);
        Stats growth = growthPerLevel(characterClass);
        int extraLevels = level - 1;
        return new Stats(
                base.health() + growth.health() * extraLevels,
                base.mana() + growth.mana() * extraLevels,
                base.strength() + growth.strength() * extraLevels,
                base.agility() + growth.agility() * extraLevels,
                base.intelligence() + growth.intelligence() * extraLevels);
    }

    private Stats baseStats(CharacterClass characterClass) {
        return switch (characterClass) {
            case WARRIOR -> new Stats(120, 20, 15, 8, 4);
            case MAGE -> new Stats(70, 120, 4, 7, 16);
            case ARCHER -> new Stats(90, 50, 8, 16, 7);
        };
    }

    private Stats growthPerLevel(CharacterClass characterClass) {
        return switch (characterClass) {
            case WARRIOR -> new Stats(20, 3, 3, 1, 0);
            case MAGE -> new Stats(8, 18, 0, 1, 3);
            case ARCHER -> new Stats(12, 6, 1, 3, 1);
        };
    }
}