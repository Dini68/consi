package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Móra Ferenc", "Kis ködmön");
        book.register("123456");

        System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getRegNumber());
    }
}
