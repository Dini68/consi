package exeption;

public class TestException {

    public void throwException() {
        System.out.println("throwex");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("try ");
            new TestException().throwException();
        } catch (Exception re) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("done ");
    }
}
