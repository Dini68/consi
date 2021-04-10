package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Egész szám: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("3-mal osztható: " + (number % 3 == 0));
    }
}
