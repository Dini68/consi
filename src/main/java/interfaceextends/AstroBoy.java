package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{
    public static final long ALTITUDE = 5;

    private Point position;
    private int angle;
    private final List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public void liftTo(long altitude) {
        walkTo(new Point(position.getX(), position.getY(), altitude));
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        moveTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

}
