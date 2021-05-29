package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {


    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int limit) {
        for (BankAccount ba: accounts) {
            if (ba.getBalance() > limit) {
                return true;
            }
        }
        return false;
    }
}
