package StrategyPattern;

public class RubberDuck extends Duck implements IQuackable {

    @Override
    void display() {
        // look-like rubber duck
    }

    @Override
    public void quack() {
        // squeak
    }
}
