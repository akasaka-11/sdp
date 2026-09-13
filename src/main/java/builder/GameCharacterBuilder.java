package builder;

public class GameCharacterBuilder {

    private String name;
    private GameCharacter.CharacterClass classType;
    private int level;
    private String weapon;
    private String armor;
    private int health;
    private int mana;
    private String specialAbility;

    public GameCharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GameCharacterBuilder setClassType(GameCharacter.CharacterClass classType) {
        this.classType = classType;
        return this;
    }

    public GameCharacterBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public GameCharacterBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public GameCharacterBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public GameCharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public GameCharacterBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public GameCharacterBuilder setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
        return this;
    }

    public GameCharacter build() {
        validate();

        return new GameCharacter(
                name,
                classType,
                level,
                weapon,
                armor,
                health,
                mana,
                specialAbility
        );
    }

    private void validate() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Character name is required.");
        }

        if (classType == null) {
            throw new IllegalStateException("Character class is required.");
        }

        if (level <= 0) {
            throw new IllegalStateException("Level must be greater than 0.");
        }

        if (health <= 0) {
            throw new IllegalStateException("Health must be greater than 0.");
        }

        if (mana < 0) {
            throw new IllegalStateException("Mana cannot be negative.");
        }
    }
}