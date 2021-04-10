package classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int amount) {
        price += amount;
    }

    public void decreasePrice(int amount) {
        price -= amount;
    }

    public static void main(String[] args) {
        Product product = new Product("óra", 5000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.increasePrice(2000);
        System.out.println(product.getPrice());

        product.decreasePrice(1000);
        System.out.println(product.getPrice());
    }
}
