package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Creator.ChicagoStylePizzaStore;
import FactoryPattern.FactoryMethod.Creator.NewYorkStylePizzaStore;

public class FactoryMethodMain {
    public static void main(String args[]) {

        NewYorkStylePizzaStore store1 = new NewYorkStylePizzaStore();
        store1.orderPizza("cheese");


        System.out.println("\n");

        store1.orderPizza("pepperoni");

        System.out.println("\n");


        ChicagoStylePizzaStore store2 = new ChicagoStylePizzaStore();
        store2.orderPizza("veggies");


    }
}
