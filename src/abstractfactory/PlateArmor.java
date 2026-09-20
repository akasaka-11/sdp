package abstractfactory;

public class PlateArmor implements Armor {
    private static final int DEFENSE = 40;

    @Override public String getName() {
        return "Plate Armor";
    }
    @Override public int getDefense() {
        return DEFENSE;
    }
}