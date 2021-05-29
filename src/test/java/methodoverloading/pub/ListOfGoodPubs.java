package methodoverloading.pub;

import java.util.List;

public class ListOfGoodPubs {

    private final List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if (goodPubs == null || goodPubs.size() == 0) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }


    public Pub findTheBest() {
        Pub result = goodPubs.get(0);
        int minTime = result.getHours()*60 + result.getMinutes();
        for (Pub p: goodPubs) {
            if (p.getHours() * 60 + p.getMinutes() < minTime) {
                result = p;
            }
        }
        return result;
    }
}
