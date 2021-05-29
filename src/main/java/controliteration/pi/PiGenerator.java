package controliteration.pi;

public class PiGenerator {

    public String getPi() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String text = "Nem a régi s durva közelítés,\n" +
                "Mi szótól szóig így kijön\n" +
                "Betűiket számlálva.\n" +
                "Ludolph eredménye már,\n" +
                "Ha itt végezzük húsz jegyen.\n" +
                "De rendre kijő még tíz pontosan,\n" +
                "Azt is bízvást ígérhetem.";
        for (char c: text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                count++;
            }
            else {
                if (count > 0) {
                    sb.append(count);
                }
                count = 0;
                if (sb.length() == 1) {
                    sb.append(".");
                }
            }
        }
        return sb.toString();
    }
}
