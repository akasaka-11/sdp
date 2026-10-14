package gamecharacter.subsystem;

import gamecharacter.model.CharacterClass;

import java.util.List;

public record CharacterProfile(
        String name,
        CharacterClass characterClass,
        int level,
        Stats stats,
        List<String> skills,
        List<String> items) {
}