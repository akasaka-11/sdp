package gamecharacter.client;

import gamecharacter.facade.CharacterCreationException;
import gamecharacter.facade.CharacterSummary;
import gamecharacter.facade.GameCharacterFacade;
import gamecharacter.model.CharacterClass;

public class Main {
    public static void main(String[] args) {
        GameCharacterFacade game = new GameCharacterFacade();

        try {
            print(game.createCharacter("Aldric", CharacterClass.WARRIOR));
            print(game.createCharacter("Lyra", CharacterClass.MAGE));
            print(game.levelUp("Lyra"));
            print(game.levelUp("Lyra"));
            print(game.levelUp("Lyra"));
        } catch (CharacterCreationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        tryCreate(game, "Aldric", CharacterClass.ARCHER);
        tryCreate(game, "Ronald", CharacterClass.MAGE);
        tryCreate(game, "bruh", CharacterClass.WARRIOR);
    }

    private static void tryCreate(GameCharacterFacade game, String name, CharacterClass cls) {
        try {
            print(game.createCharacter(name, cls));
        } catch (CharacterCreationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void print(CharacterSummary c) {
        System.out.printf("%s the %s (Lv %d) HP:%d MP:%d%n", c.name(), c.characterClass(), c.level(), c.health(), c.mana());
        System.out.println("  Skills: " + c.skills());
        System.out.println("  Items:  " + c.items());
        System.out.println();
    }
}