package enumtype.unit;

import java.math.BigDecimal;

public class UnitConvertMain {

    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
        System.out.println(uc.convert(BigDecimal.valueOf(500),
                LengthUnit.METER, LengthUnit.MILLIMETER).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(500),
                LengthUnit.MILLIMETER, LengthUnit.METER).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.METER, LengthUnit.FOOT).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.METER, LengthUnit.INCH).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.METER, LengthUnit.YARD).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.FOOT, LengthUnit.METER).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.INCH, LengthUnit.METER).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.YARD, LengthUnit.METER).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.FOOT, LengthUnit.INCH).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.YARD, LengthUnit.INCH).doubleValue());
        System.out.println(uc.convert(BigDecimal.valueOf(1),
                LengthUnit.YARD, LengthUnit.FOOT).doubleValue());

        System.out.println(uc.siUnits());
        System.out.println(UnitConverter.noSiUnits());

    }
}
