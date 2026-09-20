package abstractfactory;

public class BoneArmor implements Armor {
    private static final int DEFENSE = 25;

    @Override public String getName() {
        return "Bone Armor";
    }
    @Override public int getDefense() {
        return DEFENSE;
    }
}