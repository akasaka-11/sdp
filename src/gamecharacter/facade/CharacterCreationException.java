package gamecharacter.facade;

public class CharacterCreationException extends Exception {
    public CharacterCreationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterCreationException(String message) {
        super(message);
    }
}