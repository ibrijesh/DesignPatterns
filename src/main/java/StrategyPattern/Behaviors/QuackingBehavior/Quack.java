package StrategyPattern.Behaviors.QuackingBehavior;

public class Quack implements IQuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
