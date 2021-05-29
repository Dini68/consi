package stringconcat.employee;

public class Employee {

    private final String name;
    private final String job;
    private final int salary;

    public Employee(String name, String job, int salary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (job == null || job.isBlank()) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        if (salary % 1000 != 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + salary + " Ft";
    }

    public static void main(String[] args) {
        System.out.println(" a p p l e".length());
        System.out.println("index".charAt(2));
        System.out.println("index".indexOf('x'));
        System.out.println("somebody".contains("k"));
        System.out.println("file".replace('e', 'a'));
        System.out.println("file".replace("il", "ok"));
        System.out.println("an apple".trim());
    }
}
