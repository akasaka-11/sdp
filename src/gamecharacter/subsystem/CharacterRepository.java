package gamecharacter.subsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class CharacterRepository {
    private final Map<String, CharacterProfile> storage = new HashMap<>();
    private final Set<String> reservedNames = new HashSet<>();

    public void reserveName(String name) {
        if (!reservedNames.add(name.toLowerCase())) {
            throw new IllegalStateException("Name '" + name + "' is already taken");
        }
    }

    public void releaseName(String name) {
        String key = name.toLowerCase();
        reservedNames.remove(key);
        storage.remove(key);
    }

    public void save(CharacterProfile profile) {
        storage.put(profile.name().toLowerCase(), profile);
    }

    public Optional<CharacterProfile> find(String name) {
        return Optional.ofNullable(storage.get(name.toLowerCase()));
    }
}