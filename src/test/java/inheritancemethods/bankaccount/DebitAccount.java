package inheritancemethods.bankaccount;

public class DebitAccount {

    private final String accountNumber;
    private long balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final static double COST = - 3.0;
    public final static long MIN_COST = - 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {
        if ((long)(-amount * COST / 100) < -MIN_COST) {
            return -MIN_COST;
        }
        return (long)(-amount * COST / 100.0);
    }

    public boolean transaction(long amount) {
        if (balance >= amount) {
            balance -= amount + costOfTransaction(amount);
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        balance = 0;
    }


}
