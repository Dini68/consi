package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        note.setName(scanner.nextLine());
        System.out.print("Tárgy: ");
        note.setTopic(scanner.nextLine());
        System.out.print("Szöveg: ");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());
    }
}
