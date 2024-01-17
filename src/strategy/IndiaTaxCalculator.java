package strategy;

public class IndiaTaxCalculator implements TaxCalculator{

    @Override
    public int calculateTax(int income) {
        return income/100*30;
    }

}
