package attributes.billitem;

public class BillMain {

    public static void main(String[] args) {
        Item item1 = new Item("banán", 5, 400);
        Item item2 = new Item("pari", 3, 800);
        Item item3 = new Item("virsli", 2, 2800);
        Item item4 = new Item("bor", 1, 1400);
        Item item5 = new Item("sör", 4, 300);

        Bill bill = new Bill();
        bill.addItem(item1);
        bill.addItem(item2);
        bill.addItem(item3);
        bill.addItem(item4);
        bill.addItem(item5);

        System.out.println(bill.calculateTotalPrice());
    }
}
