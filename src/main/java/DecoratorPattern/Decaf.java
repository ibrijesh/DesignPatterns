package DecoratorPattern;

public class Decaf extends Beverage {

    public Decaf() {
        description = "decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
