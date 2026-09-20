package factorymethod;

public abstract class CharacterCreator {

    public final GameCharacter create(String name) {
        requireValidName(name);
        return createCharacter(name);
    }

    protected abstract GameCharacter createCharacter(String name);

    private void requireValidName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Character name must not be blank");
        }
    }
}