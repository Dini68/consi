package introscanner;

import java.util.Comparator;

public class YearComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}
