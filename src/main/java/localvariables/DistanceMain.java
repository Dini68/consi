package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance d = new Distance(1000.123, true);
        System.out.println(d.getDistanceKm() + " " + d.isExact());

        int v = (int)d.getDistanceKm();
        System.out.println(v);

        Distance d1 = new Distance(2000, true);
        System.out.println(d1.getDistanceKm() + " " + d.isExact());

        int v1 = (int)d1.getDistanceKm();
        System.out.println(v1);
    }
}
