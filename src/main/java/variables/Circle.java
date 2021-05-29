package variables;

public class Circle {

    private int diameter;
    public static final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter() {
        return Math.round(100 * diameter * PI) / 100.0;
    }

    public double area() {
        return Math.pow(diameter / 2.0, 2) * PI;
    }
}
