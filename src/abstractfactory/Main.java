package abstractfactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        printLoadout(new HumanFactory());
        printLoadout(new UndeadFactory());
    }

    private static void printLoadout(FactionFactory factory) {
        Objects.requireNonNull(factory, "Factory must not be null");
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        System.out.printf("%s (dmg %d) | %s (def %d)%n",
                weapon.getName(), weapon.getDamage(),
                armor.getName(), armor.getDefense());
    }
}