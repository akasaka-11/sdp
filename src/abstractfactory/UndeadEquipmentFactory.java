package abstractfactory;

import factorymethod.CharacterCreator;
import factorymethod.GameCharacter;
import factorymethod.MageCreator;

public class UndeadEquipmentFactory implements FactionEquipmentFactory {
    private final CharacterCreator characterCreator = new MageCreator();

    @Override public GameCharacter createCharacter(String name) { return characterCreator.create(name); }
    @Override public Weapon createWeapon() { return new BoneScythe(); }
    @Override public Armor createArmor() { return new BoneArmor(); }
    @Override public Mount createMount() { return new SpectralSteed(); }
}