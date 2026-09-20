package abstractfactory;

public class WarHorse implements Mount {
    private static final int SPEED = 60;

    @Override public String getName() { return "War Horse"; }
    @Override public int getSpeed() { return SPEED; }
}