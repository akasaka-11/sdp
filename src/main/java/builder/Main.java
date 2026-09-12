package builder;

public class Main {

    public static void main(String[] args) {

        CharacterDirector director = new CharacterDirector();

        GameCharacter warrior = director.createWarrior("Arthur");
        GameCharacter mage = director.createMage("Merlin");
        GameCharacter archer = director.createArcher("Robin");

        System.out.println("Characters created by Director");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(archer);

        GameCharacter customCharacter = new GameCharacterBuilder()
                .setName("Shadow")
                .setClassType("Assassin")
                .setLevel(15)
                .setWeapon("Dual Daggers")
                .setArmor("Shadow Armor")
                .setHealth(110)
                .setMana(90)
                .setSpecialAbility("Shadow Strike")
                .build();

        System.out.println("\nCustom Character");
        System.out.println(customCharacter);
    }
}