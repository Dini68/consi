package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        if (pendrives.size() == 0) {
            throw new IllegalArgumentException("No list");
        }
        Pendrive bestPen = pendrives.get(0);
        for (Pendrive p: pendrives) {
            if (p.comparePricePerCapacity(bestPen) == -1) {
                bestPen = p;
            }
        }
        return bestPen;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        if (pendrives.size() == 0) {
            throw new IllegalArgumentException("No list");
        }
        Pendrive cheapestPen = pendrives.get(0);
        for (Pendrive p: pendrives) {
            if (p.cheaperThan(cheapestPen)) {
                cheapestPen = p;
            }
        }
        return cheapestPen;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p: pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }

}
