package controladvanced.cars;

import java.util.ArrayList;
import java.util.List;

public class UsedCars {

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line: lines) {
            String[] parts = line.split(";");
            if (parts.length != 4) {
                continue;
            }
            if (parts[0].length() != 7) {
                continue;
            }
            if (Integer.parseInt(parts[1]) > 2018 || Integer.parseInt(parts[1]) < 1971) {
                continue;
            }
            if (parts[2].length() < 2) {
                continue;
            }
            if (parts[3].length() < 2) {
                continue;
            }
            if (!parts[0].contains("-")) {
                continue;
            }
            validLines.add(line);
        }
        return validLines;
    }
}
