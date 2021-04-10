package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        System.out.println(new IntroControl().subtractTenIfGreaterThanTen(5));
        System.out.println(new IntroControl().subtractTenIfGreaterThanTen(10));
        System.out.println(new IntroControl().subtractTenIfGreaterThanTen(15));
        System.out.println(new IntroControl().subtractTenIfGreaterThanTen(25));
        System.out.println(new IntroControl().subtractTenIfGreaterThanTen(-5));

        System.out.println(new IntroControl().describeNumber(0));
        System.out.println(new IntroControl().describeNumber(7));

        System.out.println(new IntroControl().greetingToJoe("Joe"));
        System.out.println(new IntroControl().greetingToJoe("Jane"));

        System.out.println(new IntroControl().calculateBonus(50000) + " Ft");
        System.out.println(new IntroControl().calculateBonus(2000000) + " Ft");

        System.out.println(new IntroControl().calculateConsumption(5000, 5023));
        System.out.println(new IntroControl().calculateConsumption(9987, 3));

        new IntroControl().printNumbers(15);

        new IntroControl().printNumbersBetween(3, 15);

        new IntroControl().printNumbersBetweenAnyDirection(5, 11);
        new IntroControl().printNumbersBetweenAnyDirection(15, 11);

        new IntroControl().printOddNumbers(45);
    }
}
