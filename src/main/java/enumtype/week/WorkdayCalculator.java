package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> result = new ArrayList<>();
        int number = firstDay.ordinal();
        for (int i = 0; i < numberOfDays; i++) {
            result.add(firstDay.values()[number + i].getDayType());
            if (number + i == 6) {
                number -= 6;
            }
        }
        return result;
    }
}
