package test;

public class Test {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new Test().sum(8, 9));
    }
}
