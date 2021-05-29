package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        Item rem = null;
        for (Item i: items) {
            if (i.getBarcode().equals(barcode)) {
                rem = i;
            }
        }
        if (rem == null) {
            throw new IllegalArgumentException("No data");
        }
        items.remove(rem);
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
