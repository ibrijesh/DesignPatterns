package StrategyPattern;

import StrategyPattern.Behaviors.FlyingBehavior.FlyWithWings;
import StrategyPattern.Behaviors.QuackingBehavior.MuteQuack;
import StrategyPattern.Behaviors.QuackingBehavior.Squack;
import StrategyPattern.Ducks.DecoyDuck;
import StrategyPattern.Ducks.Duck;
import StrategyPattern.Ducks.MallardDuck;
import StrategyPattern.Ducks.RubberDuck;

public class MainDuck {
    public static void main(String[] args) {

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.setQuackingBehavior(new MuteQuack());

        decoyDuck.performFlying();
        decoyDuck.performQuacking();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyingBehavior(new FlyWithWings());

        mallardDuck.performFlying();
        mallardDuck.performQuacking();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackingBehavior(new Squack());

        rubberDuck.performFlying();
        rubberDuck.performQuacking();

    }
}
