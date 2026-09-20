package abstractfactory;

import factorymethod.CharacterCreator;
import factorymethod.GameCharacter;
import factorymethod.WarriorCreator;

public class HumanEquipmentFactory implements FactionEquipmentFactory {
    private final CharacterCreator characterCreator = new WarriorCreator();

    @Override public GameCharacter createCharacter(String name) { return characterCreator.create(name); }
    @Override public Weapon createWeapon() { return new Longsword(); }
    @Override public Armor createArmor() { return new PlateArmor(); }
    @Override public Mount createMount() { return new WarHorse(); }
}