package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<String> menu;
    private final String name;
    private final int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = 4 * numberOfTables;
        this.menu = Menu();
    }

    private List<String> Menu() {
        List<String> basicMenu = new ArrayList<>();
        basicMenu.add("Leves");
        basicMenu.add("Hús");
        basicMenu.add("Dessert");
        basicMenu.add("Ital");
        return basicMenu;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
