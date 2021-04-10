package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int i: source) {
            if (i == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i: source) {
            if (i == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayHandler().contains(new int[]{1, 2, 3, 4, 5, 6}, 6));
        System.out.println(new ArrayHandler().contains(new int[]{1, 2, 3, 4, 5, 6}, 0));

        System.out.println(new ArrayHandler().find(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(new ArrayHandler().find(new int[]{1, 2, 3, 4, 5, 6}, 0));
    }
}
