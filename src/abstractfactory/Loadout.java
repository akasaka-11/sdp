package abstractfactory;

import factorymethod.GameCharacter;

/** Client: works only through the abstract factory and abstract products. */
public class Loadout {
    private final GameCharacter character;
    private final Weapon weapon;
    private final Armor armor;
    private final Mount mount;

    public Loadout(FactionEquipmentFactory factory, String characterName) {
        this.character = factory.createCharacter(characterName);
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
        this.mount = factory.createMount();
    }

    public String summary() {
        return String.format("%s (hp %d) | %s (dmg %d) | %s (def %d) | %s (speed %d)",
                character.getName(), character.getMaxHealth(),
                weapon.getName(), weapon.getDamage(),
                armor.getName(), armor.getDefense(),
                mount.getName(), mount.getSpeed());
    }
}