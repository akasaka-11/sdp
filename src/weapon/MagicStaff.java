package weapon;

public class MagicStaff implements Weapon {
    @Override
    public String name() {
        return "Arcane Staff";
    }

    @Override
    public int baseDamage() {
        return 15;
    }

    @Override
    public String strikeVerb() {
        return "blasts";
    }
}