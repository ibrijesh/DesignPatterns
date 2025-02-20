package StrategyPattern;

public class MallardDuck extends Duck implements IFlyable, IQuackable {
    @Override
    void display() {
        // look's like mallard.
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
