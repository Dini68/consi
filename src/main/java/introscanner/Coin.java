package introscanner;

public enum Coin {

    TWO_HUNDRED(200), HUNDRED(100), FIFTY(50), TWENTY(20), TEEN(10), FIVE(5);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
