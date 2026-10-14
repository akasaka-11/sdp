package character;

import weapon.Weapon;

public class Warrior extends GameCharacter {
    private static final int STRENGTH_BONUS = 10;

    public Warrior(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    protected String role() {
        return "Warrior";
    }

    @Override
    protected int calculateDamage() {
        return weaponDamage() + STRENGTH_BONUS;
    }
}