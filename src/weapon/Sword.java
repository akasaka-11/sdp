package weapon;

public class Sword implements Weapon {
    @Override
    public String name() {
        return "Iron Sword";
    }

    @Override
    public int baseDamage() {
        return 20;
    }

    @Override
    public String strikeVerb() {
        return "slashes";
    }
}