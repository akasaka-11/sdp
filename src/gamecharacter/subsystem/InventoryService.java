package gamecharacter.subsystem;

import gamecharacter.model.CharacterClass;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    public static final int DEFAULT_CAPACITY = 6;

    private final int capacity;

    public InventoryService() {
        this(DEFAULT_CAPACITY);
    }

    public InventoryService(int capacity) {
        this.capacity = capacity;
    }

    public List<String> starterKit(CharacterClass characterClass) {
        List<String> items = new ArrayList<>();
        add(items, "Health Potion x3");
        add(items, "Bread x5");
        switch (characterClass) {
            case WARRIOR -> { add(items, "Iron Sword"); add(items, "Wooden Shield"); }
            case MAGE -> { add(items, "Oak Staff"); add(items, "Spellbook"); }
            case ARCHER -> { add(items, "Short Bow"); add(items, "Quiver of 30 Arrows"); }
        }
        return items;
    }

    private void add(List<String> items, String item) {
        if (items.size() >= capacity) {
            throw new IllegalStateException("Inventory is full (capacity " + capacity + ")");
        }
        items.add(item);
    }
}