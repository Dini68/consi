package person.sub;


import introscanner.Employee;
import person.Person;

import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        introscanner.Person person = new introscanner.Person();
        Person person1 = new Person("kj");
        System.out.println(person.getNames(List.of(new Employee("kkk", 22))));
        System.out.println(person1.getName());
    }
}
