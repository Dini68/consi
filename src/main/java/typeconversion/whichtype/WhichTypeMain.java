package typeconversion.whichtype;

public class WhichTypeMain {

    public static void main(String[] args) {
        WhichType wt = new WhichType();
        System.out.println(wt.whichType("12"));
        System.out.println(wt.whichType("-12"));
        System.out.println(wt.whichType("212"));
        System.out.println(wt.whichType("21212"));
        System.out.println(wt.whichType("2121212"));
        System.out.println(wt.whichType("12212121"));
        System.out.println(wt.whichType("12212122221"));
    }
}
