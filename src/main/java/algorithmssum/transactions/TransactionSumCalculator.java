package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction t: transactions) {
            if (t.isCredit()) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

}
