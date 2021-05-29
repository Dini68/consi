package algorithmsmax.sales;

import algorithmsmax.sales.Salesperson;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        int min = Integer.MAX_VALUE;
        Salesperson result = null;
        for (Salesperson sp: salespersons) {
            if (sp.getDifferenceFromTarget() < min) {
                result = sp;
                min = sp.getDifferenceFromTarget();
            }
        }
        return result;
    }
}
