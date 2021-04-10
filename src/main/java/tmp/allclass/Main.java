package tmp.allclass;

import java.util.ArrayList;
import java.util.List;

public class Main extends House{

    private int age;

    public Main(String name, int age) {
        super(name);
        this.age = age;
    }

    public Main(String name) {
        super(name);
    }

    @Override
    public String toString() {

        return super.toString() + "Main{" +
                "age=" + age +
                '}';
    }


    public static void main(String[] args) {
//        Main main = new Main("Dénes");
//        House house = new Main("László");
//
//        Main main1 = new Main("Tünde", 45);
//        System.out.println(main1);
//        System.out.println(house.getName());
//        System.out.println(house);
//        System.out.println(main.getName());

        List<String> names = new ArrayList<>();
        names.add(0, "Johnamamamananana");
        List<String> copy = new ArrayList<>(names);
        copy.add("Jack");
        System.out.println(names);
        System.out.println(copy);
        System.out.println(names.get(0).lastIndexOf("m"));
        System.out.println(names.get(0).indexOf("m"));
        String vok = "jhkjhkjh";
        System.out.print(vok.indent(5));
        System.out.println(vok);
        StringBuilder sb = new StringBuilder("kjéjk");
        sb.deleteCharAt(sb.lastIndexOf("k"));
        System.out.println(sb.toString());
        String name;
    }
}
