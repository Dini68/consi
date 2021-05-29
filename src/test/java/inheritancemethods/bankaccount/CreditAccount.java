package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount{

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        if (getBalance() > amount) {
            return super.transaction(amount);
        }

        if (getBalance() + overdraftLimit + costOfTransaction(amount) < amount) {
            return false;
        }

        overdraftLimit += getBalance() - amount - costOfTransaction(amount);

        balanceToZero();
        return true;
    }
}
