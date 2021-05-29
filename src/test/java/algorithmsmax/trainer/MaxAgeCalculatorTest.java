package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    List<Trainer> trainers = Arrays.asList(
            new Trainer("John", 60),
            new Trainer("Bill", 20),
            new Trainer("Kate", 71),
            new Trainer("Mary", 70),
            new Trainer("Karl", 20)
    );

    @Test
    public void testTrainerMaxAge() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        assertEquals(71, maxAgeCalculator.trainerWithMaxAge(trainers).getAge());
        assertEquals("Kate", maxAgeCalculator.trainerWithMaxAge(trainers).getName());
    }



}