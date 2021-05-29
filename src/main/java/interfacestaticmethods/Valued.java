package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double totalValue(List<Valued> items) {
        double sum = 0;
        for (Valued v: items) {
            sum += v.getValue();
        }
        return sum;
    }
}
