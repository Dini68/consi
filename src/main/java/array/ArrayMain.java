package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök",
                "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);

        int[] twoPowers = new int[5];
        for (int i = 0; i < 5; i++) {
            twoPowers[i] = (int)Math.pow(2,i);
        }
        System.out.println(Arrays.toString(twoPowers));

        boolean[] arr = {false, true, false, true, false, true};
        for (boolean b: arr) {
            System.out.println(b);
        }
    }
}
