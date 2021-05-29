package methodoverloading.pub;

public class Pub {

    private final String name;
    private final int hours;
    private final int minutes;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return name + ";" + hours + ":" + minutes;
    }

    public Pub getOpenFrom() {
        return this;
    }
}
