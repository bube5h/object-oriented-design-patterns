package decorator.example1;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
