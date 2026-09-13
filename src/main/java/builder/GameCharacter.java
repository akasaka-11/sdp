package builder;

public class GameCharacter {

    public enum CharacterClass {
        WARRIOR,
        MAGE,
        ARCHER,
        ASSASSIN
    }

    private final String name;
    private final CharacterClass classType;
    private final int level;
    private final String weapon;
    private final String armor;
    private final int health;
    private final int mana;
    private final String specialAbility;

    public GameCharacter(
            String name,
            CharacterClass classType,
            int level,
            String weapon,
            String armor,
            int health,
            int mana,
            String specialAbility) {

        this.name = name;
        this.classType = classType;
        this.level = level;
        this.weapon = weapon;
        this.armor = armor;
        this.health = health;
        this.mana = mana;
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", classType=" + classType +
                ", level=" + level +
                ", weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", specialAbility='" + specialAbility + '\'' +
                '}';
    }
}