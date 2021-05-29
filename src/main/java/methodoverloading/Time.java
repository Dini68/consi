package methodoverloading;


public class Time {

    private final int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public boolean isEqual(Time time) {
        return this.hours * 3600 + this.minutes * 60 + this.seconds ==
                time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return (this.hours == hours) && (this.minutes == minutes) && (this.seconds == seconds);
    }

    public boolean isEarlier(Time time) {
        return this.hours * 3600 + this.minutes * 60 + this.seconds <
                time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.hours * 3600 + this.minutes * 60 + this.seconds <
                hours * 3600 + minutes * 60 + seconds;
    }

}
