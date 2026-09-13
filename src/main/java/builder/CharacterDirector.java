package builder;

public class CharacterDirector {

    private static final int STARTING_LEVEL = 10;

    public GameCharacter createWarrior(String name) {
        return new GameCharacterBuilder()
                .setName(name)
                .setClassType(GameCharacter.CharacterClass.WARRIOR)
                .setLevel(STARTING_LEVEL)
                .setWeapon("Great Sword")
                .setArmor("Heavy Armor")
                .setHealth(150)
                .setMana(30)
                .setSpecialAbility("Power Strike")
                .build();
    }

    public GameCharacter createMage(String name) {
        return new GameCharacterBuilder()
                .setName(name)
                .setClassType(GameCharacter.CharacterClass.MAGE)
                .setLevel(STARTING_LEVEL)
                .setWeapon("Magic Staff")
                .setArmor("Light Robe")
                .setHealth(80)
                .setMana(180)
                .setSpecialAbility("Fireball")
                .build();
    }

    public GameCharacter createArcher(String name) {
        return new GameCharacterBuilder()
                .setName(name)
                .setClassType(GameCharacter.CharacterClass.ARCHER)
                .setLevel(STARTING_LEVEL)
                .setWeapon("Long Bow")
                .setArmor("Leather Armor")
                .setHealth(100)
                .setMana(70)
                .setSpecialAbility("Multi Shot")
                .build();
    }
}