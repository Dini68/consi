package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        System.out.println(new Performance(LocalDate.of(2021,5, 1), "Edda",
                LocalTime.of(19,00), LocalTime.of(21,00)).getInfo());
        System.out.println(new Performance(LocalDate.of(2020,3, 30), "Republic",
                LocalTime.of(20,00), LocalTime.of(21,30)).getInfo());
        System.out.println(new Performance(LocalDate.of(2011,11, 1), "Bikini",
                LocalTime.of(18,00), LocalTime.of(20,00)).getInfo());
    }
}
