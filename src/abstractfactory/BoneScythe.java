package abstractfactory;

public class BoneScythe implements Weapon {
    private static final int DAMAGE = 35;

    @Override public String getName() {
        return "Bone Scythe";
    }
    @Override public int getDamage() {
        return DAMAGE;
    }
}