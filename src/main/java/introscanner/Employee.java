package introscanner;

public class Employee implements Comparable<Employee> {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return this.yearOfBirth-other.yearOfBirth;
//        return this.name.compareTo(other.name);
    }
}
