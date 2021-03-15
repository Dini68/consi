package plan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plan4 {
    public void writeFile(String fileName) {
        Path file = Path.of(fileName);
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (int i = 0; i < 1100; i++) {
                outputStream.write("abcde\n".getBytes());
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    public static void main(String[] args) {
        Plan4 plan4 = new Plan4();
        plan4.writeFile("teszt.txt");
    }
}
