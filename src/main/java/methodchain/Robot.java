package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimuth;

    private final List<NavigationPoint> navigationList = new ArrayList<>();

    public List<NavigationPoint> getNavigationList() {
        return navigationList;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public Robot go(int meter) {
        distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        azimuth += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(new NavigationPoint(distance, azimuth));
        return this;
    }

}
