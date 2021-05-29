package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s) {
        List<Type> result = new ArrayList<>();
        if (Long.parseLong(s) >= Type.BYTE.getMinValue() &&
                Long.parseLong(s) <= Type.BYTE.getMaxValue()) {
            result.add(Type.BYTE);
        }
        if (Long.parseLong(s) >= Type.SHORT.getMinValue() &&
                Long.parseLong(s) <= Type.SHORT.getMaxValue()) {
            result.add(Type.SHORT);
        }
        if (Long.parseLong(s) >= Type.INT.getMinValue() &&
                Long.parseLong(s) <= Type.INT.getMaxValue()) {
            result.add(Type.INT);
        }
        return result;
    }
}
