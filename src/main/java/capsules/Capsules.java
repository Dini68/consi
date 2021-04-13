package capsules;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsules = new ArrayList<>();

    public void addLast(String capsule) {
        capsules.add(capsule);
    }

    public void addFirst(String capsule) {
        capsules.add(0, capsule);
    }

    public void removeFirst() {
        capsules.remove(0);
    }

    public void removeLast() {
        capsules.remove(capsules.size()-1);
    }

    public List<String> getColors() {
        return capsules;
    }

    public static void main(String[] args) {
        Capsules c = new Capsules();
        c.addLast("P");
        c.addLast("F");
        c.addLast("Z");
        c.addLast("S");
        c.addLast("K");

        System.out.println(c.getColors());

        c.addFirst("P");
        System.out.println(c.getColors());

        c.removeLast();
        System.out.println(c.getColors());

        c.removeFirst();
        System.out.println(c.getColors());

        List<String> result = c.getColors();

        result.clear();

        System.out.println(c.getColors());
    }
}
