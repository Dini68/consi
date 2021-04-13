package finalmodifier;

public class TaxCalculator {

    public static final double TAX = 0.27;

    public double tax(double price) {
        return price * TAX;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
        int basicPrice = 1000;

        System.out.println("Nettó: " +basicPrice);
        System.out.println("ÁFA (27%): " + new TaxCalculator().tax(basicPrice));
        System.out.println("Bruttó: " +new TaxCalculator().priceWithTax(basicPrice));
    }
}
