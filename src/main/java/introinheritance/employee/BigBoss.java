package introinheritance.employee;

public class BigBoss extends Boss{

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    @Override
    public int getNumberOfEmployees() {
        return super.getNumberOfEmployees();
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
