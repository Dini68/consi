package plan;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plan2 {

    public void readFile (String fileName) {
        Path file = Path.of(fileName);
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = new byte[10];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                System.out.println(size);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
    public static void main(String[] args) {
        Plan2 plan2 = new Plan2();
        plan2.readFile("map.txt");
    }
}
