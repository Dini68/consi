package car;

public class Track {

    private long id;
    private String band;
    private String title;
    private double length;

    public Track(long id, String band, String title, double length) {
        this.id = id;
        this.band = band;
        this.title = title;
        this.length = length;
    }

    public Track(String band, String title, double length) {
        this.band = band;
        this.title = title;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public String getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", band='" + band + '\'' +
                ", title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
