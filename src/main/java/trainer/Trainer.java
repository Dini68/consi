package trainer;

public class Trainer {
    private String name;
    private int age;

    public Trainer(String name) {
        this.name = name;
    }

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Trainer(int age) {
        this.age = age;
    }


    public Trainer() {
        this(null, 0);
    }
}
