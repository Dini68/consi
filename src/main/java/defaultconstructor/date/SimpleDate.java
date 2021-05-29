package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isValidParam(year, month, day)) {
            throw new IllegalArgumentException(
            "One or more given parameter cannot be applied! " + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isValidParam(int year, int month, int day) {
        if (year < 1900 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDay;
        int plusDay = getPlusDay(year);
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> maxDay = 31;
            case 4, 6, 9, 11 -> maxDay = 30;
            case 2 -> maxDay = 28 + plusDay;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        }
        return day <= maxDay;
    }

    private int getPlusDay(int year) {
        int plusDay = 0;
        if (year % 4 == 0) {
            plusDay = 1;
        }
        if (year % 100 == 0) {
            plusDay = 0;
        }
        if (year % 400 == 0) {
            plusDay = 1;
        }
        return plusDay;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
