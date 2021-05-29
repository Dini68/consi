package virtualmethod.vehicle;

public class Vehicle {

    public final static int PERSON_AVERAGE_WEIGHT = 75;

    private final int vehicleWeight;

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }
}
