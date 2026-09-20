package factorymethod;

public class MageCreator extends CharacterCreator {
    @Override
    protected GameCharacter createCharacter(String name) {
        return new Mage(name);
    }
}