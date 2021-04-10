package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("csónakázók száma: ");
            number = Integer.parseInt(scanner.nextLine());

            if (number < 3 && number > 0) {
                System.out.println("A 2 személyes kiadva");
                System.out.println("8 fő még mehet");
            }
            if (number == 3) {
                System.out.println("A 3 személyes kiadva");
                System.out.println("7 fő még mehet");
            }
            if (number > 3 && number < 6) {
                System.out.println("Az 5 személyes kiadva");
                System.out.println("5 fő még mehet");
            }
            if (number > 5 && number < 8) {
                System.out.println("A 2 -és az 5 személyes kiadva");
                System.out.println("3 fő még mehet");
            }
            if (number == 8) {
                System.out.println("A 3 -és az 5 személyes kiadva");
                System.out.println("2 fő még mehet");
            }
            if (number > 8 && number < 11) {
                System.out.println("A 2- a 3- és az 5 személyes kiadva ");
                System.out.println("Nincs több csónak");
            }
            if (number > 10) {
                System.out.println("A 2- a 3- és az 5 személyes kiadva ");
                System.out.println(number - 10 + " fő a parton maradt");
            }
        } while (number != 0);
        System.out.println("nincs több csónakázó");
    }
}
