package tmp.allclass;

public enum Gender {

    FEMALE(1), MALE(2);

    private int code;

    Gender(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
