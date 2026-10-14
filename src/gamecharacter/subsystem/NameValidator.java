package gamecharacter.subsystem;

import java.util.Set;
import java.util.regex.Pattern;

public class NameValidator {
    private static final Pattern ALLOWED = Pattern.compile("[A-Za-z][A-Za-z0-9_]{2,15}");
    private static final Set<String> RESERVED = Set.of("admin", "gm", "system", "moderator");

    public void validate(String name) {
        if (name == null || !ALLOWED.matcher(name).matches()) {
            throw new IllegalArgumentException(
                    "Name must be 3-16 characters, start with a letter, and use only letters, digits or '_'");
        }
        if (RESERVED.contains(name.toLowerCase())) {
            throw new IllegalArgumentException("Name '" + name + "' is reserved");
        }
    }
}