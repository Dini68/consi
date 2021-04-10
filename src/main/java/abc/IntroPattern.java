package abc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntroPattern {

    public static void main(String[] args) {
        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher(".am");
        Boolean b = m.matches();
        System.out.println(b);

        boolean b1 = Pattern.matches(".m", "am");
        System.out.println(b1);

        System.out.println(Pattern.matches("[amn]", "acd"));
        System.out.println(Pattern.matches("[^anc]", "c"));
        System.out.println(Pattern.matches("[a-zA-V]", "T"));
        System.out.println(Pattern.matches("[MS][a-z]{4}", "Monica"));
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]*", "xyyzy"));
    }
}
