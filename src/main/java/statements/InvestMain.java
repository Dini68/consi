package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Befektetett összeg: ");
        int fund = Integer.parseInt(scanner.nextLine());
        System.out.print("kamatláb: ");
        int rate = Integer.parseInt(scanner.nextLine());
        Investment in = new Investment(fund, rate);


        System.out.println("Tőke: " + in.getFund());
        System.out.println("Kamatláb: " + in.getInterestRate());

        System.out.print("Hányadik napon kéred a hozamot : ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println("Hozam " + days + " napra:" + in.getYield(days));

        System.out.print("Hányadik napon van vége a befektetésnek: ");
        int days2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Kivett összeg " + days2 + " nap után: " + in.close(days2));

        System.out.print("Hányadik napon van vége a befektetésnek: ");
        int days3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Kivett összeg " + days3 + " nap után: " + in.close(days3));

    }
}
