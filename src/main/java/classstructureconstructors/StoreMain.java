package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store("gumi");
        Store store1 = new Store("felni");

        store.store(200);
        store.dispatch(150);

        store1.store(500);
        store1.dispatch(200);

        System.out.println(store.getProduct() + " " + store.getStock());
        System.out.println(store1.getProduct() + " " + store1.getStock());
    }
}
