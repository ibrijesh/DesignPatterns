package DecoratorPattern;

import DecoratorPattern.Components.Beverage;
import DecoratorPattern.Components.DarkRoast;
import DecoratorPattern.Components.Espresso;
import DecoratorPattern.Components.HouseBlend;
import DecoratorPattern.Decorator.Mocha;
import DecoratorPattern.Decorator.Soy;
import DecoratorPattern.Decorator.Whip;

public class MainCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);             // double Mocha and  Whip

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);            //  soy, whip and mocha

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
