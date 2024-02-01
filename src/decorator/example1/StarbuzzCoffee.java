package decorator.example1;

public class StarbuzzCoffee {

    /**
     * This is just an example. Typically, decorators will be created using other patterns like
     * Factory or Builder.
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
            + " $" + beverage.cost());

        Beverage beverage3 = new HouseBlend();

        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription()
            + " $" + beverage3.cost());
    }

}
