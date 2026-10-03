package character;

import java.util.Objects;
import weapon.Weapon;

public abstract class GameCharacter {
    private final String name;
    private Weapon weapon;

    protected GameCharacter(String name, Weapon weapon) {
        this.name = Objects.requireNonNull(name);
        this.weapon = Objects.requireNonNull(weapon);
    }

    public void equip(Weapon newWeapon) {
        this.weapon = Objects.requireNonNull(newWeapon);
    }

    public String attack() {
        return String.format("%s (%s) %s with %s for %d damage",
                name, role(), weapon.strikeVerb(), weapon.name(), calculateDamage());
    }

    protected abstract String role();

    protected abstract int calculateDamage();

    protected int weaponDamage() {
        return weapon.baseDamage();
    }
}