package FactoryPattern.NotFactoryMethod;

import FactoryPattern.NotFactoryMethod.Creator.PizzaStore;
import FactoryPattern.NotFactoryMethod.Creator.SimplePizzaFactory;

public class NotFactoryMethod {
    public static void main(String args[]) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore1 = new PizzaStore(factory);
        pizzaStore1.orderPizza("cheese");

        System.out.println("\n");


        PizzaStore pizzaStore2 = new PizzaStore(factory);
        pizzaStore2.orderPizza("pepperoni");


        System.out.println("\n");

        PizzaStore pizzaStore3 = new PizzaStore(factory);
        pizzaStore3.orderPizza("veggies");

    }
}
