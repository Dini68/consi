package classstructureintegrate;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public  void transfer(BankAccount to, int amount) {
        to.balance += amount;
        balance -= amount;
    }

    public String getInfo() {
        return owner + "  (" + accountNumber + "): " + balance + "Ft";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        String owner = scanner.nextLine();
        System.out.print("Számlaszám: ");
        String accNum = scanner.nextLine();
        System.out.print("Összeg: ");
        int balance = Integer.parseInt(scanner.nextLine());
        BankAccount b1 = new BankAccount(accNum, owner, balance);
        System.out.println(b1.getInfo());

        System.out.print("Név: ");
        owner = scanner.nextLine();
        System.out.print("Számlaszám: ");
        accNum = scanner.nextLine();
        System.out.print("Összeg: ");
        balance = Integer.parseInt(scanner.nextLine());
        BankAccount b2 = new BankAccount(accNum, owner, balance);
        System.out.println(b2.getInfo());

        System.out.print("az első számlahoz betesz: ");
        b1.deposit(Integer.parseInt(scanner.nextLine()));
        System.out.println(b1.getInfo());

        System.out.print("az első számlaból kivesz: ");
        b1.withdraw(Integer.parseInt(scanner.nextLine()));
        System.out.println(b1.getInfo());

        System.out.print("átutal: ");
        b1.transfer(b2, Integer.parseInt(scanner.nextLine()));
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
    }
}
