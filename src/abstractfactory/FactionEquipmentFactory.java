package abstractfactory;

import factorymethod.GameCharacter;

public interface FactionEquipmentFactory {
    GameCharacter createCharacter(String name);
    Weapon createWeapon();
    Armor createArmor();
    Mount createMount();
}