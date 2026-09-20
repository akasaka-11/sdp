package abstractfactory;

public class HumanFactory implements FactionFactory {
    @Override public Weapon createWeapon() { return new Longsword(); }
    @Override public Armor createArmor() { return new PlateArmor(); }
}