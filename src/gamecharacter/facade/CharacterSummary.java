package gamecharacter.facade;

import java.util.List;

public record CharacterSummary(
        String name,
        String characterClass,
        int level,
        int health,
        int mana,
        List<String> skills,
        List<String> items) {
}