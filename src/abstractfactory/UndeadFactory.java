package abstractfactory;

public class UndeadFactory implements FactionFactory {
    @Override public Weapon createWeapon() { return new BoneScythe(); }
    @Override public Armor createArmor() { return new BoneArmor(); }
}