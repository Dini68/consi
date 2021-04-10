package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(b);
        System.out.println(c);

        System.out.println(("" + "").length());
        String abc = "Abcde";
        System.out.println(abc.length());

        System.out.println(abc.charAt(0) + "," + abc.charAt(2));
        System.out.println(abc.substring(0,3));


    }
}
