package strategy;

import java.util.List;

public class Context {

    private TaxCalculator indiaTaxCalculator = new IndiaTaxCalculator();
    private TaxCalculator usaTaxCalculator = new UsaTaxCalculator();

    public int calculateTax(String country, int income) {

        switch (country) {
            case "INR":
                return indiaTaxCalculator.calculateTax(income);
            case "USA":
                return usaTaxCalculator.calculateTax(income);
            default:
                return -1;
        }
    }

}
