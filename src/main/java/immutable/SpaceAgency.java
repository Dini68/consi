package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String regId) {
        for (Satellite s: satellites) {
            if (s.getRegisterId().equals(regId)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + regId);
    }

    @Override
    public String toString() {
        return "" + satellites;
    }
}
