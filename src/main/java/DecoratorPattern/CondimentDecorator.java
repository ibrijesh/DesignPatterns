package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract double cost();
}
