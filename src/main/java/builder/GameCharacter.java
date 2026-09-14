package builder;

public class GameCharacter {

    public enum CharacterClass {
        WARRIOR,
        MAGE,
        ARCHER,
        ASSASSIN
    }

    private String name;
    private CharacterClass classType;
    private int level;
    private String weapon;
    private String armor;
    private int health;
    private int mana;
    private String specialAbility;

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
