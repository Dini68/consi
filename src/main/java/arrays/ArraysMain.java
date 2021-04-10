package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        System.out.println(new ArraysMain().numberOfDaysAsString());
        System.out.println(Arrays.toString(new ArraysMain().daysOfWeek()));
        System.out.println(new ArraysMain().multiplicationTableAsString(5));
        double[] day = new double[24];
        for (int i = 0; i < 24; i++) {
            day[i] = i;
        }
        double[] anotherDay = new double[24];
        for (int i = 0; i < 24; i++) {
            anotherDay[i] = i;
        }
        System.out.println(new ArraysMain().sameTempValues(day, anotherDay));
        anotherDay[5] = 6;
        System.out.println(new ArraysMain().sameTempValues(day, anotherDay));

        int[] lottArr = {1,2,3,5,4};
        int[] lottArr2 = {5,1,4,3,2};
        System.out.println(Arrays.toString(lottArr));
        System.out.println(Arrays.toString(lottArr2));
        System.out.println(new ArraysMain().wonLottery(Arrays.copyOf(lottArr, 5),
                Arrays.copyOf(lottArr2, 5)));
        System.out.println(Arrays.toString(lottArr));
        System.out.println(Arrays.toString(lottArr2));

        System.out.println(new ArraysMain().wonLottery(new int[]{1,2,3,4,5}, new int[]{5,1,4,3,6}));

        double[] days1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        double[] days2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};

        System.out.println(new ArraysMain().sameTempValuesDaylight(days1, days2));
    }

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String[] daysOfWeek() {
        String[] daysOfWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        return daysOfWeek;
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplication = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplication[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(multiplication);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] numbers, int[] numbers2) {
        Arrays.sort(numbers);
        Arrays.sort(numbers2);
        return Arrays.equals(numbers, numbers2);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int minHours = getMinHours(day, anotherDay);
        return Arrays.equals(Arrays.copyOfRange(day,0, minHours-1),
                Arrays.copyOfRange(anotherDay,0, minHours-1));
    }

    private int getMinHours(double[] day, double[] anotherDay) {
        int minHours = day.length;
        if (day.length > anotherDay.length) {
            minHours = anotherDay.length;
        }
        return minHours;
    }
}
