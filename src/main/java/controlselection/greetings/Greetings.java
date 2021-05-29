package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public String greet(int hour, int minute) {
        LocalTime time = LocalTime.of(hour, minute);
        if (time.isBefore(LocalTime.of(5,1))){
            return "jó éjt";
        }
        if (time.isBefore(LocalTime.of(9,1))){
            return "jó reggelt";
        }
        if (time.isBefore(LocalTime.of(18,31))){
            return "jó napot";
        }
        if (time.isBefore(LocalTime.of(20,01))){
            return "jó estét";
        }
        return "jó éjt";
    }
}
