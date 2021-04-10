package canoe;

public enum CanoeType {

    RED(1), GREEN(1.2), BLUE(1.5);

    private double multiple;

    CanoeType(double multiple) {
        this.multiple = multiple;
    }

    public double getMultiple() {
        return multiple;
    }
}
