package vowel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

    public static final String VOWELS = "aáeéiíoóöőuúüű";

    public String filterVowels(BufferedReader reader) {
        try {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                for (char c: line.toCharArray()) {
                    if (!VOWELS.contains(Character.toString(c).toLowerCase())) {
                        sb.append(c);
                    }
                }
            }
            return sb.toString();
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        VowelFilter vf = new VowelFilter();
        Path file = Path.of("word.txt");
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(file))){
            System.out.println(vf.filterVowels(br));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
