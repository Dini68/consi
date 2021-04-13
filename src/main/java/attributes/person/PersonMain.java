package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Address address = new Address("Magyarország", "Budapest",
                "Vikár u", "1181");

        Person person = new Person("Kovács", "12345678SA");

        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Simon Tunde", "122112121wa");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        address.correctData("Románia", "Sepsi", "Domb u", "2222");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());
    }
}
