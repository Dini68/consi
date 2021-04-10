package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. időpont: ");
        System.out.println("óra: ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.println("perc: ");
        int minute = Integer.parseInt(scanner.nextLine());
        System.out.println("másodperc: ");
        int second = Integer.parseInt(scanner.nextLine());
        Time time = new Time(hour, minute, second);

        System.out.println("2. időpont: ");
        System.out.println("óra: ");
        hour = Integer.parseInt(scanner.nextLine());
        System.out.println("perc: ");
        minute = Integer.parseInt(scanner.nextLine());
        System.out.println("másodperc: ");
        second = Integer.parseInt(scanner.nextLine());
        Time time2 = new Time(hour, minute, second);

        System.out.println("Az első időpont " + time.toString() + " = " + time.getInMinutes() + " perc");

        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");

        System.out.println("Az első korábbi, mint a második: " + time.earlierThan(time2));

    }
}
