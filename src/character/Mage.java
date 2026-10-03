package character;

import weapon.Weapon;

public class Mage extends GameCharacter {
    private static final double INTELLIGENCE_MULTIPLIER = 1.5;

    public Mage(String name, Weapon weapon) {
        super(name, weapon);
    }

    @Override
    protected String role() {
        return "Mage";
    }

    @Override
    protected int calculateDamage() {
        return (int) (weaponDamage() * INTELLIGENCE_MULTIPLIER);
    }
}