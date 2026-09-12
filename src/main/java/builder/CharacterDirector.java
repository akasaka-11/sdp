package builder;

public class CharacterDirector {

    public GameCharacter createWarrior(String name) {
        return new GameCharacterBuilder()
                .setName(name)
                .setClassType("Warrior")
                .setLevel(10)
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
                .setClassType("Mage")
                .setLevel(10)
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
                .setClassType("Archer")
                .setLevel(10)
                .setWeapon("Long Bow")
                .setArmor("Leather Armor")
                .setHealth(100)
                .setMana(70)
                .setSpecialAbility("Multi Shot")
                .build();
    }
}