package inheritanceconstructor.cars;

public class Jeep extends Car{

    private final double extraCapacity;
    private double extraFuel;

    public double getExtraFuel() {
        return extraFuel;
    }

    public Jeep(double fuelRate, double fuel, double tankCapacity,
                double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel + extraFuel);
    }

    @Override
    public void drive(int km) {
        if (km * getFuelRate() / 100.0 > getFuel() + extraFuel) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        double actFuel = km * getFuelRate() / 100.0;
        if (extraFuel >= actFuel) {
            extraFuel -= actFuel;
        }
        else {
            actFuel -= extraFuel;
            extraFuel = 0;
            super.modifyFuelAmount(-actFuel);
        }
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }
}
