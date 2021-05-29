package stringbasic.pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate yearOfBirth;
    private Gender gender;
    private String registration;

    public Pet(String name, LocalDate yearOfBirth, Gender gender, String registration) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.registration = registration;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }


    public Gender getGender() {
        return gender;
    }

    public String getRegistration() {
        return registration;
    }
}
