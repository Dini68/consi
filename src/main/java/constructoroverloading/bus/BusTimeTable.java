package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int hour = firstHour; hour <= lastHour; hour++) {
            timeTable.add(new SimpleTime(hour, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (SimpleTime s: timeTable) {
            if (s.difference(actual) > 0) {
                return s;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}

