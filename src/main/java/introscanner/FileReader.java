package introscanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private List<String> flights = new ArrayList<>();

    public List<String> getFlights() {
        return new ArrayList<>(flights);
    }

    public List<String> readLines(BufferedReader reader) throws IOException {
        List<String> result = new ArrayList<>();
        String line;
        while ((line = reader.readLine())  != null) {
//            System.out.println(line);
            flights.add(line);
        }
        return result;
    }

    public int getDepartures () {
        int countDeparture = 0;
        for (String s: getFlights()) {
            if (s.contains("Departure")) {
                System.out.println(s);
                countDeparture++;
            }
        }
        return countDeparture;
    }

    public int getArrival () {
        int countArrival = 0;
        for (String s: getFlights()) {
            if (s.contains("Arrival")) {
                System.out.println(s);
                countArrival++;
            }
        }
        return countArrival;
    }

    public static void main(String[] args) {
//        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
//            new FileReader().readLines(reader);
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
        FileReader fileReader = new FileReader();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("data.csv")))) {
            fileReader.readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        System.out.println(fileReader.getDepartures());
        System.out.println(fileReader.getArrival());


    }


}