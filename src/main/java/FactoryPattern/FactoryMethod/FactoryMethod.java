package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Creator.ChicagoStylePizza;
import FactoryPattern.FactoryMethod.Creator.NewYorkStylePizzaStore;

public class FactoryMethod {
    public static void main(String args[]) {

        NewYorkStylePizzaStore store1 = new NewYorkStylePizzaStore();
        store1.orderPizza("cheese");


        System.out.println("\n");

        store1.orderPizza("pepperoni");

        System.out.println("\n");


        ChicagoStylePizza store2 = new ChicagoStylePizza();
        store2.orderPizza("veggies");


    }
}
