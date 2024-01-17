package strategy;

public class UsaTaxCalculator implements TaxCalculator{

    @Override
    public int calculateTax(int income) {
        return income/100*40;
    }

}
