package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name) {
        for (Employee e: employees) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    public List<String> listEmployeeNames() {
        List<String> result = new ArrayList<>();
        for (Employee e: employees) {
            result.add(e.getName());
        }
        return result;
    }
}
