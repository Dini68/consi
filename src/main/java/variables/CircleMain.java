package variables;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kör átmérője: ");
        int diameter = Integer.parseInt(scanner.nextLine());

        Circle c = new Circle(diameter);

        System.out.print("A kör kerülete: ");
        System.out.println(c.perimeter());

        System.out.print("A kör területe: ");
        System.out.println(c.area());
    }
}
