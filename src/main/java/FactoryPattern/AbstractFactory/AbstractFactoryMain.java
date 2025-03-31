package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.store.ChicagoPizzaStore;
import FactoryPattern.AbstractFactory.store.NewYorkPizzaStore;
import FactoryPattern.AbstractFactory.store.PizzaStore;

public class AbstractFactoryMain {
    public static void main(String args[]) {

        PizzaStore store1 = new ChicagoPizzaStore();
        store1.orderPizza("cheese");
        store1.orderPizza("veggies");

        System.out.println();

        PizzaStore store2 = new NewYorkPizzaStore();
        store2.orderPizza("pepperoni");
        store2.orderPizza("cheese");

    }
}
