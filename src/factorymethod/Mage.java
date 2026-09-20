package factorymethod;

public class Mage implements GameCharacter {
    private static final int MAX_HEALTH = 80;
    private static final int FIREBALL_DAMAGE = 55;

    private final String name;

    public Mage(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public int getMaxHealth() { return MAX_HEALTH; }

    @Override
    public String attack() {
        return String.format("%s hurls a fireball for %d damage", name, FIREBALL_DAMAGE);
    }
}