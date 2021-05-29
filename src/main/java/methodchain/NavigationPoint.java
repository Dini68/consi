package methodchain;

public class NavigationPoint {

    private final int actualDistance;
    private final int actualAzimuth;

    public NavigationPoint(int actualDistance, int actualAzimuth) {
        this.actualDistance = actualDistance;
        this.actualAzimuth = actualAzimuth;
    }

    public int getActualDistance() {
        return actualDistance;
    }

    public int getActualAzimuth() {
        return actualAzimuth;
    }

    @Override
    public String toString() {
        return "distance: " + getActualDistance() + " azimuth: " + getActualAzimuth();
    }
}
