package stringconcat.stringconcat;

public class Name {

    private final String familyName;
    private final String middleName;
    private final String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (familyName == null || familyName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
//        if (middleName == null || middleName.isBlank()) {
//            throw new IllegalArgumentException("Family name and given name must not be empty!");
//        }
        if (givenName == null || givenName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (familyName == null || familyName.isBlank()) {
            throw new IllegalArgumentException("Wrong data");
        }
        if (givenName == null || givenName.isBlank()) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
//        this.title = null;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGivenName() {
        return givenName;
    }

    public Title getTitle() {
        return title;
    }

    public String concatNameWesternStyle() {
        String mN =  middleName + " ";
        if (middleName == null || middleName == "") {
            mN = "";
        }
        if (title == null) {
            return givenName + " " + mN + familyName;
        }
        return title.getTitle() + ". " + givenName + " " + mN + familyName;
    }

    public String concatNameHungarianStyle() {
        String mN =  middleName + " ";
        if (middleName == null || middleName == "") {
            mN = "";
        }
        if (title == null) {
            return familyName + " " + mN + givenName;
        }
        return title.getTitle() + ". " + familyName + " " + mN + givenName;
    }
}
