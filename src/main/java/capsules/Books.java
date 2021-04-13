package capsules;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String book) {
        titles.add(book);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String s: titles) {
            if (s.indexOf(prefix) == 0) {
                result.add(s);
            }
        }
        return result;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void removeByPrefix(String prefix) {
        titles.removeAll(findAllByPrefix(prefix));
    }

    public static void main(String[] args) {
        Books b = new Books();
        b.add("Varázskő");
        b.add("Sorskönyv");
        b.add("Újratervezés");
        b.add("Vadászkaland");
        b.add("Vakondtúrás");

        System.out.println(b.findAllByPrefix("S"));
        System.out.println(b.findAllByPrefix("V"));
        System.out.println(b.getTitles());

        b.removeByPrefix("S");
        System.out.println(b.getTitles());
    }
}
