package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> numbers) {
        List<Integer> once = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (Integer i: numbers) {
            if (once.contains(i)) {
                result.add(i);
            }
            if (!once.contains(i)) {
                once.add(i);
            }
        }
        return result;
    }
}
