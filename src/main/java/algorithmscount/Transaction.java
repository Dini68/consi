package algorithmscount;

public class Transaction {

    private final String accountNumber;
    private final TransactionType transactionType;
    private final int amount;

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return transactionType == TransactionType.CREDIT;
    }

    public boolean isDebit() {
        return transactionType == TransactionType.DEBIT;
    }
}
