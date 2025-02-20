package StrategyPattern.Behaviors.FlyingBehavior;

public class FlyWithWings implements IFlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
