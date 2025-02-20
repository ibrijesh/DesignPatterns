package StrategyPattern.Behaviors.FlyingBehavior;

public class FlyNoWay implements IFlyingBehavior {

    @Override
    public void fly() {
        System.out.println("No Flying Behavior");
    }
}
