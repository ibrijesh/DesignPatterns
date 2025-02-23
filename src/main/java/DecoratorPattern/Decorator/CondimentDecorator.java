package DecoratorPattern.Decorator;

import DecoratorPattern.Components.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract double cost();
}
