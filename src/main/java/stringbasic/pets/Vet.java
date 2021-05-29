package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private final List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet pet) {
        for (Pet p: pets) {
            if (areEquals(p, pet)) {
                return;
            }
        }
        pets.add(pet);
    }

    private boolean areEquals(Pet pet1, Pet pet2) {
        return pet1.getRegistration().equals(pet2.getRegistration());
    }
}
