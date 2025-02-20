package StrategyPattern.Behaviors.QuackingBehavior;

public class MuteQuack implements IQuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
