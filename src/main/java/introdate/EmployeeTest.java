package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.println("Születési dátum: ");
        System.out.print("Születési év: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Születési hónap: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Születési nap: ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.print("Belépési időpont: ");
        LocalDateTime be = LocalDateTime.now();
        System.out.println(be);

        Employee employee = new Employee(name, LocalDate.of(year, month, day), be);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési év: " + employee.getDateOfBirth());
        System.out.println("Belépés időpontja: " + employee.getBeginEmployment());

    }
}
