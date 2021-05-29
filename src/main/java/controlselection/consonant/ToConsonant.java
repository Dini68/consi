package controlselection.consonant;

public class ToConsonant {

    public char convertToConsonant(char letter) {
        String towels = "aeiou";
        if (towels.contains(Character.toString(letter).toLowerCase())) {
            letter ++;
        }
        return letter;
    }
}
