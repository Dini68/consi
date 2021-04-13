package literals;

public class literalsMain {

    public static void main(String[] args) {
        System.out.println(1 + "" + 2);
        System.out.println("" + 1 + 2);
        System.out.println(Integer.toString(1) + 2);

        double quotient = 3 / 4;
        System.out.println(quotient);

        double quotient2 = 3 / 4.0;
        System.out.println(quotient2);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = "title".toUpperCase();
        System.out.println(word);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
