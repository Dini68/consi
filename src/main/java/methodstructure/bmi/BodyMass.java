package methodstructure.bmi;

public class BodyMass {

    private final double weight;
    private final double height;

    public BodyMass(double weight, double height) {
        if (height == 0 || weight == 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.weight = weight;
        this.height = height;
    }



    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        return weight / height / height;
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass bodyMass) {
        return this.bodyMassIndex() < bodyMass.bodyMassIndex();
    }

}
