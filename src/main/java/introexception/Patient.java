package introexception;

public class Patient {

    private final String name;
    private final String socialSecurityNumber;
    private final int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Wrong data");
        }
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Wrong data");
        }
        for (char c: socialSecurityNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("No digit");
            }
        }
        new SsnValidator().isValidSsn(socialSecurityNumber);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
