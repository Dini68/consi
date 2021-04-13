package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {
        System.out.println(new PrimitiveTypes().toBinaryString(0));
        System.out.println(new PrimitiveTypes().toBinaryString(1));
        System.out.println(new PrimitiveTypes().toBinaryString(2));
        System.out.println(new PrimitiveTypes().toBinaryString(5));
        System.out.println(new PrimitiveTypes().toBinaryString(10));
        System.out.println(new PrimitiveTypes().toBinaryString(255));
        System.out.println(new PrimitiveTypes().toBinaryString(15));

        System.out.println(Integer.toBinaryString(15));

        System.out.println(
                new PrimitiveTypes().toBinaryString(15).equals(Integer.toBinaryString(15)));

        System.out.println(Integer.valueOf(new PrimitiveTypes().toBinaryString(15), 2).equals(
                Integer.valueOf(Integer.toBinaryString(15),2)));


      //  System.out.println(new Integer(1) + new Integer(2)); 3
    }
}
