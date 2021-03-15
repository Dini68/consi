package plan;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plan {

    public int readFile(String filename) {
        int sumByte = 0;
        Path file = Path.of(filename);
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = new byte[10];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                System.out.println(size);
                sumByte += size;
                for (int i = 0; i < size; i++) {
                    System.out.print((char)bytes[i]);
                }
                System.out.println();
            }
            return sumByte;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        Plan plan = new Plan();
        System.out.println(plan.readFile("map.txt"));
    }

}
