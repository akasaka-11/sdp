package factorymethod;

public class Warrior implements GameCharacter {
    private static final int MAX_HEALTH = 150;
    private static final int SWORD_DAMAGE = 30;

    private final String name;

    public Warrior(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public int getMaxHealth() { return MAX_HEALTH; }

    @Override
    public String attack() {
        return String.format("%s slashes with a greatsword for %d damage", name, SWORD_DAMAGE);
    }
}