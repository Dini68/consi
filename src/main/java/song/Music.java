package song;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Előadó: ");
        song.setBand(scanner.nextLine());
        System.out.print("Cím: ");
        song.setTitle(scanner.nextLine());
        System.out.print("Hossz: ");
        song.setLength(Integer.parseInt(scanner.nextLine()));

        System.out.println(song.getBand() + " - " + song.getTitle() + " (" + song.getLength() + " perc)");
    }
}
