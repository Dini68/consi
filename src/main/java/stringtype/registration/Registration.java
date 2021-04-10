package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        UserValidator us = new UserValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();
        System.out.println(us.isValidUsername(username));

        System.out.print("Jelszó: ");
        String password1 = scanner.nextLine();
        System.out.print("Jelszó mégegyszer: ");
        String password2 = scanner.nextLine();
        System.out.println(us.isValidPassword(password1, password2));

        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.println(us.isValidEmail(email));

    }
}
