package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        boolean b = false;
        System.out.println(b);

        int a = 2;
        int i = 3, j= 4;
        int k = i;
        System.out.println(k);

        String s = "Hello World";
        String t = s;
        System.out.println(t);
        t = "teszt";
        System.out.println(s);
        System.out.println(t);
        {
            int x = 8;
            System.out.println(a);
        }
    }
}
