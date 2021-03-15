package song;

import java.math.BigInteger;

public class exam {

    public static void main(String[] args) {
        BigInteger a = new BigInteger(String.valueOf(454541434));

        System.out.print("enum nevek: ");
        for(Coin c: Coin.values()) {
            System.out.print(c + " ");
        }

        System.out.print("\nenum sorszámok: ");
        for(Coin c: Coin.values()) {
            System.out.print(c.ordinal() + " ");
        }

        System.out.print("\nenum értékek: ");
        for(Coin c: Coin.values()) {
            System.out.print(c.getMultiplier() + " ");
        }
        Coin c1 = Coin.valueOf("LUXURY");
        System.out.print("\nEnum változó:  " + c1 + " ");
        System.out.println(c1.getMultiplier());
    }
}
