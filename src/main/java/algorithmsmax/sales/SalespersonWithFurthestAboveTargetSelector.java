package algorithmsmax.sales;

import algorithmsmax.sales.Salesperson;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        int max = 0;
        Salesperson result = null;
        for (Salesperson sp: salespersons) {
            if (sp.getDifferenceFromTarget() > max) {
                result = sp;
                max = sp.getDifferenceFromTarget();
            }
        }
        return result;
    }
}
