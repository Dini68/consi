package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private final List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public Trooper findTrooperByName(String name) {
        for (Trooper t: troopers) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        throw new IllegalArgumentException("No such name");
    }

    public Trooper findClosestTrooper(Position target) {
        if (troopers.size() == 0) {
            throw new IllegalArgumentException("No list");
        }
        Trooper result = troopers.get(0);
        double minDistance = result.distanceFrom(target);
        for (Trooper t: troopers) {
            if (t.distanceFrom(target) < minDistance) {
                minDistance = t.distanceFrom(target);
                result = t;
            }
        }
        return result;
    }

    public void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }
}
