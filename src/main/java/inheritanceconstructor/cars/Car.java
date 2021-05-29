package inheritanceconstructor.cars;

public class Car {

    private final double fuelRate;
    private double fuel;
    private final double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        double actFuel = fuelRate * km / 100.0;
        if (fuel < actFuel) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        fuel -= actFuel;
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }
}
