package algorithmsdecision.bankaccounts;

public class BankAccount {

    private final String nameOfOwner;
    private final String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public boolean withdraw(int amount) {
        if (this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public boolean deposit(int amount) {
        this.balance += amount;
        return true;
    }


}
