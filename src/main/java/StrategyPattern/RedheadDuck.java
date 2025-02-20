package StrategyPattern;

public class RedheadDuck extends Duck implements IFlyable, IQuackable {

    @Override
    void display() {
        // look's like Redhead Duck.
    }

    @Override
    public void fly() {
        // fly
    }

    @Override
    public void quack() {
        // quack
    }
}
