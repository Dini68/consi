package filescanner;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void loadFromFile() {
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                String[] parts = line.split(";");
                String regNum = parts[0];
                String author = parts[1];
                String title = parts[2];
                int yearOfPublish = Integer.parseInt(parts[3]);
                books.add(new Book(regNum, author, title, yearOfPublish));
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile();
        System.out.println(library.getBooks());
    }
}
