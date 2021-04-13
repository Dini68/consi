package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person1 = new Person("Kovács", 53);
        Person person2 = new Person("Simon", 51);

        Person person = new Person("Hunor", 10);
        person1 = person;

        person2 = person1;

        person2.setName("Manci");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int x1 = 24;
        int x2 = x1;
        x2++;
        System.out.println(x1);
        System.out.println(x2);
    }
}
