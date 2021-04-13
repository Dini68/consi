package primitivetypes;

public class PrimitiveTypes {

    public String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        int d = n;
        while (d > 0) {
            int m = d % 2;
            d = d / 2;
            sb.insert(0, m);
        }
        int i = sb.length();
        while (i < 32) {
            sb.insert(0,0);
            i++;
        }
        return sb.toString();
    }
}
