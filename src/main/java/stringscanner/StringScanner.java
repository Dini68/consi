package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (delimiter == null && !intString.contains(" ")) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        else {
            if (delimiter == null) delimiter = " ";
        }
        Scanner scanner = new Scanner(intString).useDelimiter(delimiter);
        int sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            else {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        Scanner scanner = new Scanner(intString);
        int sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            else {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(text);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String actual = scanner.nextLine();
            if (actual.contains(word)) {
                if (!sb.toString().equals("")) {
                    sb.append("\n");
                }
                sb.append(actual);
            }
        }
        return sb.toString();
    }
}
