package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot{

    private Point position;
    private int angle;
    private final List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);
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
