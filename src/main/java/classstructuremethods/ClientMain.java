package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        client.setName(scanner.nextLine());
        System.out.print("Év: ");
        client.setYear(Integer.parseInt(scanner.nextLine()));
        System.out.print("Cím: ");
        client.setAddress(scanner.nextLine());

        System.out.println(client.getName() + " " + client.getYear() + " " + client.getAddress());

        System.out.print("Új Cím: ");
        client.migrate(scanner.nextLine());

        System.out.println(client.getName() + " " + client.getYear() + " " + client.getAddress());
    }
}
