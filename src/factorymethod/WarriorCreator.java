package factorymethod;

public class WarriorCreator extends CharacterCreator {
    @Override
    protected GameCharacter createCharacter(String name) {
        return new Warrior(name);
    }
}