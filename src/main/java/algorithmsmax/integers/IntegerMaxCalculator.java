package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {
    public int max(List<Integer> integers) {
        if (integers == null || integers.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        int max = integers.get(0);
        for (int i: integers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
