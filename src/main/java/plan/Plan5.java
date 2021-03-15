package plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Plan5 {

    public List<String> readLines(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                result.add(line);
            }
            return result;
        } catch (IOException ioException) {
            throw new IllegalStateException("not read file", ioException);
        }
    }

}
