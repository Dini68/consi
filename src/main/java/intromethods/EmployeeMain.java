package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Kovács", 2014, 250000);

        System.out.println(employee.toString());

        employee.raiseSalary(50_000);

        System.out.println(employee.toString());

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
    }
}
