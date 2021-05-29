package methodpass.troopers;

import methodpass.troopers.Position;

public class Trooper {

    private final String name;
    private Position position = new Position(0, 0);

    public Trooper(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        position = target;
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }
}
