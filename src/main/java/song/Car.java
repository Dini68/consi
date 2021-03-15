package song;

public class Car {

    private long id;
    private String Name;
    private long price;

    public Car(String name, long price) {
        Name = name;
        this.price = price;
    }

    public Car(long id, String name, long price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
