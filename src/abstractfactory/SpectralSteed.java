package abstractfactory;

public class SpectralSteed implements Mount {
    private static final int SPEED = 80;

    @Override public String getName() { return "Spectral Steed"; }
    @Override public int getSpeed() { return SPEED; }
}