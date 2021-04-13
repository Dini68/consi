package enumtype.week;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {
        WorkdayCalculator wc = new WorkdayCalculator();

        System.out.println(wc.dayTypes(Day.MONDAY, 4));
        System.out.println(wc.dayTypes(Day.MONDAY, 5));
        System.out.println(wc.dayTypes(Day.MONDAY, 6));
        System.out.println(wc.dayTypes(Day.MONDAY, 7));
        System.out.println(wc.dayTypes(Day.MONDAY, 8));

        System.out.println(wc.dayTypes(Day.WEDNESDAY, 8));
    }
}
