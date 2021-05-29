package immutable;

public class Satellite {

    private CelestialCoordinates coordinates;
    private String registerId;

    public Satellite(CelestialCoordinates coordinates, String registerId) {
        if (registerId == null || registerId.isBlank()) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.coordinates = coordinates;
        this.registerId = registerId;
    }

    public CelestialCoordinates getCoordinates() {
        return coordinates;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void modifyDestination(CelestialCoordinates celestialCoordinates) {
        int x = coordinates.getX() + celestialCoordinates.getX();
        int y = coordinates.getY() + celestialCoordinates.getY();
        int z = coordinates.getZ() + celestialCoordinates.getZ();
        this.coordinates = new CelestialCoordinates(x, y, z);
    }

    @Override
    public String toString() {
        return registerId + ": " + coordinates.toString();
    }
}
