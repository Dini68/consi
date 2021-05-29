package introinheritance.basket;

public class ShoppingBasket {

    private final Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }
    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0;
        for (Item i: basket.getItems()) {
            sum += i.getNettoPrice();
        }
        return sum;
    }

    public double sumTaxValue() {
        double sum = 0;
        for (Item i: basket.getItems()) {
            sum += i.getTaxAmount();
        }
        return sum;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    }
    public void removeMostExpensiveItem() {
        if (basket.getItems().size() == 0) {
            throw new IllegalArgumentException("No list");
        }
        Item remMaxItem = basket.getItems().get(0);
        double maxValue = remMaxItem.getNettoPrice();
        for (Item it: basket.getItems()) {
            if (it.getNettoPrice() > maxValue) {
                maxValue = it.getNettoPrice();
                remMaxItem = it;
            }
        }
        basket.removeItem(remMaxItem.getBarcode());
    }
}
