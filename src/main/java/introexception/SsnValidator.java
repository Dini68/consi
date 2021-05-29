package introexception;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        int count = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int lastDigit = 0;
        for (char c: ssn.toCharArray()) {
            count ++;
            if (count == 9) {
                lastDigit = Character.getNumericValue(c);
                continue;
            }
            if (count % 2 == 1) {
                sumOdd += Character.getNumericValue(c);
            }
            else {
                sumEven += Character.getNumericValue(c);
            }
        }
        if ((sumOdd * 3 + sumEven * 7) % 10 != lastDigit) {
            return false;
        }
        return true;
    }
}
