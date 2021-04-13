package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("Kovács", 1968);
        Employee e2 = new Employee("Simon", 1970);
        Employee e3 = new Employee("Kabát", 1980);

        List<Employee> basicEmployees = new ArrayList<>();
        basicEmployees.add(e1);
        basicEmployees.add(e2);
        basicEmployees.add(e3);

        Company c = new Company(basicEmployees);
        System.out.println(c.listEmployeeNames());

        c.addEmployee(new Employee("Szekeres", 2000));
        System.out.println(c.listEmployeeNames());

        System.out.println(c.findEmployeeByName("Kovács"));

    }
}
