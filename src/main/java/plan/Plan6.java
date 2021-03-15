package plan;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Plan6 {

    public void writeFile () {
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        Path file = Path.of("employees.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (String employee: employees) {
                writer.write(employee + "\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public static void main(String[] args) {
        Plan6 plan6 = new Plan6();
        plan6.writeFile();
    }
}
