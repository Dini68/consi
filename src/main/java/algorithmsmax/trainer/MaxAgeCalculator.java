package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer result = null;
        int max = 0;
        for (Trainer t: trainers) {
            if (t.getAge() > max) {
                max = t.getAge();
                result = t;
            }
        }
        return result;
    }
}
