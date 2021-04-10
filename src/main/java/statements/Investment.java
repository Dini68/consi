package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.cost = 3.0;
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return fund * interestRate / 100.0 * days / 365.0;
    }

    public double close(int days) {
        double result = (fund + getYield(days)) * (1000.0 - cost) / 1000.0;
        result = (active) ? result : 0;
        active = false;
        return result;
    }

    public int getInterestRate() {
        return interestRate;
    }
}
