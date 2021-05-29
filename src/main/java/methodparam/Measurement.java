package methodparam;

public class Measurement {

    private final double[] measurements;

    public Measurement(double[] measurements) {
        this.measurements = measurements;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        int index = 0;
        for (Double d: measurements) {
            if (d > lower && d < upper) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    public double minimum() {
        if (measurements.length == 0) {
            throw new IllegalArgumentException("List is empty.");
        }
        double min = measurements[0];
        for (Double d: measurements) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double maximum() {
        if (measurements.length == 0) {
            throw new IllegalArgumentException("List is empty.");
        }
        double max = measurements[0];
        for (Double d: measurements) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
