package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Languages {

    private List<String> languages = new ArrayList<>();

    public void addLanguage (String name) {
        languages.add(name);
    }

    public void min5Character () {
        for (String s: languages) {
            if (s.length() > 5) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
//        Languages lg = new Languages();
//        lg.addLanguage("Java");
//        lg.addLanguage("Python");
//        lg.addLanguage("JavaScript");
//        lg.min5Character();
//
//        String s1 = "alma";
//        String s2 = "alma";
//
//        System.out.println(s1 == s2);  // tue
//        System.out.println(s1.equals(s2)); // true
//
//        String s3 = new String("alma");
//
//        System.out.println(s3 == s2);  // false
//        System.out.println(s3.equals(s2)); // true
//
//        String s4 = null;
//
//        System.out.println(s3 == s4); //false
//        System.out.println(s4 == s3); //false
//
//        System.out.println(s3.equals(s4)); //false
//       // System.out.println(s4.equals(s3)); //exception
//
//        String s5 = "al" + "ma";
//        System.out.println(s5 == s2); // true
//        // System.out.println(s4.length());
//        System.out.println(s5.length());
//
//        char c = 'a';
//        char c1 = 'm';
//        System.out.println(c);
//        System.out.println(c + 1);
//        System.out.println(c + c1);
//        System.out.println(c1);
        String ok;
        do {
            numberGuessing();
            System.out.print("Folytatod? ");
            Scanner scanner = new Scanner(System.in);
            ok = scanner.nextLine();
        } while (ok.toLowerCase().equals("y"));

    }

    private static void numberGuessing() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Gondoltam egy számra");
        int number = rnd.nextInt(100) + 1;
        int tip = 0;
        int count = 0;
        do {
            count ++;
            System.out.print(count + ". tipp: ");
            boolean notNumber;
            do {
                notNumber = false;
                try {
                    tip = Integer.parseInt(scanner.nextLine());
                    if (tip < 1 || tip > 100) {
                        System.out.println("A szám 1..100 lehet.");
                        notNumber = true;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Ez nem szám");
                    notNumber = true;
                }
            } while (notNumber);
            if (tip < number) {
                System.out.println("A gondolt szám nagyobb");
            }
            if (tip > number) {
                System.out.println("A gondolt szám kisebb");
            }
            if (tip == number) {
                System.out.println("Gratulálok, eltaláltad " + count + " lépésből");
            } else if (count == 6) {
                System.out.print("Nem sikerült kitalálnod 6 lépésből: ");
                System.out.println(number);
                tip = number;
            }
        } while (tip != number);
    }
}
