package canoe;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {

    private List<CanoeRental> canoeRentals = new ArrayList<>();

    public List<CanoeRental> getCanoeRentals() {
        return canoeRentals;
    }

    public void createRental(CanoeRental canoeRental) {
        canoeRentals.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name) {
        for (CanoeRental cr: canoeRentals) {
            if (cr.getName().equals(name) && cr.getEndTime() == null) {
                return cr;
            }
        }
        throw new IllegalArgumentException("No such active rental with name");
    }

    public void closeRentalByName(String name, LocalDateTime endTime) {
        findRentalByName(name).setEndTime(endTime);
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime) {
        CanoeRental cr = findRentalByName(name);
//        closeRentalByName(cr.getName(), endTime);
        double hours = Duration.between(cr.getStartTime(), endTime.plusMinutes(59)).toHours();
        return hours * 5000 * cr.getCanoeType().getMultiple();
    }

    public List<CanoeRental> listClosedRentals() {
        List<CanoeRental> result = new ArrayList<>();
        for (CanoeRental cr: canoeRentals) {
            if (cr.getEndTime() != null) {
                result.add(cr);
            }
        }
        Collections.sort(result, Comparator.comparing(CanoeRental::getStartTime));
        return result;
    }

    public Map<CanoeType, Integer> countRentals() {
        Map<CanoeType, Integer> result = new HashMap<>();
        for (CanoeRental cr: canoeRentals) {
            if (!result.containsKey(cr.getCanoeType())) {
                result.put(cr.getCanoeType(), 1);
            }
            else {
                result.put(cr.getCanoeType(), result.get(cr.getCanoeType()) + 1);
            }
        }
        return result;
    }
}
