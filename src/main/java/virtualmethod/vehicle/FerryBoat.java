package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    public final static int MAX_CARRY_WEIGHT = 2000;

    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getVehicleWeight() + PERSON_AVERAGE_WEIGHT;
    }

    public boolean canCarry(Car car) {
        return MAX_CARRY_WEIGHT > car.getVehicleWeight();
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
