package controlselection.month;

public class DayInMonth {

    public int numberOfDays(int year, String month) {
        int plusDay = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            plusDay = 1;
        }
        return switch (month.toLowerCase()) {
            case "április", "június", "szeptember", "november" -> 30;
            case "január", "március", "május", "július", "augusztus", "október", "december" -> 31;
            case "február" -> 28 + plusDay;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }
}
