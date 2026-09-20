package abstractfactory;

public class Longsword implements Weapon {
    private static final int DAMAGE = 25;

    @Override public String getName() { return "Longsword"; }
    @Override public int getDamage() { return DAMAGE; }
}