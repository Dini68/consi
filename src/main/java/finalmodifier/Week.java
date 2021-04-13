package finalmodifier;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS_OF_WEEK = Arrays.asList("Hétfő", "Kedd", "Szerda",
            "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public final int number;

    public Week(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        System.out.println(DAYS_OF_WEEK.get(0));

        System.out.println(DAYS_OF_WEEK.get(1));
        DAYS_OF_WEEK.set(1, "Szerda");
        System.out.println(DAYS_OF_WEEK.get(1));

        System.out.println(DAYS_OF_WEEK);

//        List<String> newList = new ArrayList<>();
//        DAYS_OF_WEEK = newList;
        final int count;
        count = 5;

        System.out.println(new CircleCalculator().calculatePerimeter(10));
    }
}
