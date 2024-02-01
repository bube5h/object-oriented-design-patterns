package strategy;

public class Context {

    private final TaxCalculator indiaTaxCalculator = new IndiaTaxCalculator();
    private final TaxCalculator usaTaxCalculator = new UsaTaxCalculator();

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
