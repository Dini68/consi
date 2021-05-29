package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction t: transactions) {
            for (BankAccount ba: accounts) {
                if (t.getAccountNumber().equals(ba.getAccountNumber())) {
                    if (t.getTransactionOperation() == TransactionOperation.CREDIT) {
                        if (ba.deposit(t.getAmount())) {
                            t.setStatus(TransactionStatus.SUCCEEDED);
                        } else {
                            t.setStatus(TransactionStatus.PENDING);
                        }
                    }
                    if (t.getTransactionOperation() == TransactionOperation.DEBIT) {
                        ba.withdraw(t.getAmount());
                        t.setStatus(TransactionStatus.SUCCEEDED);
                    }
                }
            }
        }
    }
}
