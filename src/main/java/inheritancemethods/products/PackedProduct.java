package inheritancemethods.products;

import java.math.BigDecimal;

public class PackedProduct extends Product{

    private final int packingUnit;
    private final BigDecimal weightOfBox;

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals,
                         int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        double wu = weightOfBox.doubleValue();
        double boxes = ((pieces - 1) / packingUnit + 1) * wu;
        return super.totalWeight(pieces).add(BigDecimal.valueOf(boxes));
    }
}
