package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private final List<Object> items = new ArrayList<>();
    private int cursor;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        return cursor + 1 < items.size();
    }

    public Object next() {
        if (hasNext()) {
            cursor ++;
            return items.get(cursor);
        }
        throw new IllegalArgumentException("No more object");
    }

    public boolean contains(Object item){
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
