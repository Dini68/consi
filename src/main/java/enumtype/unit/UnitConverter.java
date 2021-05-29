package enumtype.unit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){
        BigDecimal result = null;
        double toMM = length.longValue()*source.getRate();
        double toTarget = toMM / target.getRate();
        result = BigDecimal.valueOf(toTarget);
        return result;
    }

    public List<LengthUnit> siUnits() {
        List<LengthUnit> result = new ArrayList<>();
        for (LengthUnit lu: LengthUnit.values()) {
            if (lu.getSiType() == SiType.SI) {
                result.add(lu);
            }
        }
        return result;
    }

    public static List<LengthUnit> noSiUnits() {
        List<LengthUnit> result = new ArrayList<>();
        for (LengthUnit lu: LengthUnit.values()) {
            if (lu.getSiType() == SiType.NO_SI) {
                result.add(lu);
            }
        }
        return result;
    }
}
