package FactoryPattern.NotFactoryMethod.Creator;

import FactoryPattern.NotFactoryMethod.Product.CheesePizza;
import FactoryPattern.NotFactoryMethod.Product.PepperoniPizza;
import FactoryPattern.NotFactoryMethod.Product.Pizza;
import FactoryPattern.NotFactoryMethod.Product.VeggiesPizza;

public class SimplePizzaFactory {

    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggies" -> new VeggiesPizza();
            default -> null;
        };
    }

}
