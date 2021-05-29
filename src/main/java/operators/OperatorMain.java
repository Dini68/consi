package operators;

public class OperatorMain {

    public static void main(String[] args) {
        Operators op = new Operators();
        System.out.println(op.isEven(100));
        System.out.println(op.isEven(3));
        System.out.println(op.isEven(0));

        System.out.println(op.multiplyByPowerOfTwo(5, 2));
        System.out.println(op.multiplyByPowerOfTwo(5, 3));

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
//        int j = Integer.parseInt(s, 2);
        long j = Long.parseLong(s, 2);
        System.out.println(j);

        System.out.println(0333);
    }


}
