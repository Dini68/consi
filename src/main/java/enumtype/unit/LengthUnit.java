package enumtype.unit;

public enum LengthUnit {

    MILLIMETER(SiType.SI, 1), CENTIMETER(SiType.SI, 10), METER(SiType.SI, 1000),
    YARD(SiType.NO_SI, 944.4), FOOT(SiType.NO_SI, 304.8), INCH(SiType.NO_SI, 25.4);

    private SiType siType;
    private double rate;

    LengthUnit(SiType siType, double rate) {
        this.siType = siType;
        this.rate = rate;
    }

    public SiType getSiType() {
        return siType;
    }

    public double getRate() {
        return rate;
    }
}
