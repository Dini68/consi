package methodstructure.pendrives;

public class Pendrive {

    private final String name;
    private final int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price;
    }

    public void risePrice(int percent) {
        price = (int)Math.round(price * (100 + percent) / 100.0);
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        return Double.compare((double) price / capacity, (double) pendrive.price / pendrive.capacity);
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return price < pendrive.price;
    }

}
