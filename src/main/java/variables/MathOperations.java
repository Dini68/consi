package variables;

import java.util.Random;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a feladat megoldása?");
        Random rnd = new Random();
        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        int c = rnd.nextInt(10);
        int d = rnd.nextInt(10);
        int e = rnd.nextInt(9) + 1;
        double result;
        System.out.println("(" + a + " + " + b + ") * (" + c + " - " + d + " / " + e + ")");
        result = Math.round(100 * (a + b) * (c - d / (double)e)) / 100.0;
//        System.out.println(result);
        double solve = Double.parseDouble(scanner.nextLine());

        if (result - solve < 0.0001) {
            System.out.println("A megoldás helyes!");
        }
        else {
            System.out.println("A megoldás rossz, a helyes eredmény: " + result);
        }
    }
}
