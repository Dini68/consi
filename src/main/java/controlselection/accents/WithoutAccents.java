package controlselection.accents;

public class WithoutAccents {

    public char convertToCharWithoutAccents(char letter) {
        String accents = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
        String without = "aeiooouuuAEIOOOUUU";
        if (accents.contains(Character.toString(letter).toLowerCase())) {
            return without.charAt(accents.indexOf(letter));
        }
        return letter;
    }

}
