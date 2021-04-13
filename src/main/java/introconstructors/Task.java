package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {

    private final String title;
    private final String description;
    private LocalDateTime startDateTime;
    private LocalTime duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public void start() {
        this.startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("Mosás", "Ruha kimosása");
        task.setDuration(LocalTime.of(1, 20));
        task.start();

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());
    }
}
