package StrategyPattern;

public class DecoyDuck extends Duck{

    @Override
    void display() {
        // look-like decoy
    }

    @Override
    void fly() {
        // do nothing
    }
}
