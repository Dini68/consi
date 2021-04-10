package client;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        client.setName(scanner.nextLine());
        System.out.print("Year: ");
        client.setYear(Integer.parseInt(scanner.nextLine()));
        System.out.print("Address: ");
        client.setAddress(scanner.nextLine());

        System.out.println("Name: " + client.getName());
        System.out.println("Year: " + client.getYear());
        System.out.println("Address: " + client.getAddress());
    }
}
