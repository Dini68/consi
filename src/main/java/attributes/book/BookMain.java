package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Night reader");

        System.out.println(book.getTitle());

        book.setTitle("Egri Csillagok");

        System.out.println(book.getTitle());

    }
}
