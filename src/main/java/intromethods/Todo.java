package intromethods;

public class Todo {

    private final String caption;
    private boolean finished;

    public Todo(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish() {
        this.finished = true;
    }

    @Override
    public String toString() {
        return caption + " (" + finished + ")";
    }
}
