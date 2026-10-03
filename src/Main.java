import character.GameCharacter;
import character.Mage;
import character.Warrior;
import weapon.Bow;
import weapon.MagicStaff;
import weapon.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Ronald", new Sword());
        GameCharacter mage = new Mage("Teonis", new MagicStaff());

        System.out.println(warrior.attack());
        System.out.println(mage.attack());

        System.out.println("   ||| switching weapons at runtime |||  ");
        warrior.equip(new Bow());
        mage.equip(new Sword());

        System.out.println(warrior.attack());
        System.out.println(mage.attack());
    }
}