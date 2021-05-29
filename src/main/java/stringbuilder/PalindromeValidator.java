package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        if (text.isBlank()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c: text.toCharArray()) {
            sb.insert(0, c);
        }
        return sb.toString().equalsIgnoreCase(text);
    }

}
