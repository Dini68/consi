package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int minAmount) {
        int count = 0;
        for (BankAccount ba: bankAccounts) {
            if (ba.getBalance() > minAmount) {
                count ++;
            }
        }
        return  count;
    }
}
