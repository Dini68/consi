package algorithmscount;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int maxLimit) {
        int count = 0;
        for (Transaction t: transactions) {
            if (t.getAmount() < maxLimit) {
                count ++;
            }
        }
        return count;
    }
}
