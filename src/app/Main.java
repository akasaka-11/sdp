package app;

import abstractfactory.FactionEquipmentFactory;
import abstractfactory.HumanEquipmentFactory;
import abstractfactory.Loadout;
import abstractfactory.UndeadEquipmentFactory;
import factorymethod.CharacterCreator;
import factorymethod.MageCreator;
import factorymethod.WarriorCreator;

public class Main {
    public static void main(String[] args) {
        CharacterCreator warriorCreator = new WarriorCreator();
        CharacterCreator mageCreator = new MageCreator();
        System.out.println(warriorCreator.create("Aldric").attack());
        System.out.println(mageCreator.create("Elira").attack());

        FactionEquipmentFactory human = new HumanEquipmentFactory();
        FactionEquipmentFactory undead = new UndeadEquipmentFactory();
        System.out.println(new Loadout(human, "Aldric").summary());
        System.out.println(new Loadout(undead, "Morgrath").summary());

        try {
            warriorCreator.create(" ");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}