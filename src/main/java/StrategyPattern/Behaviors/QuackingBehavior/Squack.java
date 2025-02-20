package StrategyPattern.Behaviors.QuackingBehavior;

public class Squack implements IQuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
