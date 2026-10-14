package weapon;

public class Bow implements Weapon {
    @Override
    public String name() {
        return "Longbow";
    }

    @Override
    public int baseDamage() {
        return 18;
    }

    @Override
    public String strikeVerb() {
        return "pierces";
    }
}