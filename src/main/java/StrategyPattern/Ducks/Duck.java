package StrategyPattern.Ducks;

import StrategyPattern.Behaviors.FlyingBehavior.FlyNoWay;
import StrategyPattern.Behaviors.FlyingBehavior.IFlyingBehavior;
import StrategyPattern.Behaviors.QuackingBehavior.IQuackingBehavior;
import StrategyPattern.Behaviors.QuackingBehavior.Quack;

public abstract class Duck {

    private IFlyingBehavior flyingBehavior;
    private IQuackingBehavior quackingBehavior;

    public Duck() {
        flyingBehavior = new FlyNoWay();
        quackingBehavior = new Quack();
    }

    public void swim() {
    }

    public void performFlying() {
        flyingBehavior.fly();
    }

    public void performQuacking() {
        quackingBehavior.quack();
    }

    public void setFlyingBehavior(final IFlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackingBehavior(final IQuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }

    abstract void display();      // abstract because since all the  duck subtype look's different.

    // Other duck-like method's
}
