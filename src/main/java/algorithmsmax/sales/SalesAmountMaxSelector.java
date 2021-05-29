package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {


    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        int max = 0;
        Salesperson result = null;
        for (Salesperson sp: salespersons) {
            if (sp.getAmount() > max) {
                result = sp;
                max = sp.getAmount();
            }
        }
        return result;
    }
}
