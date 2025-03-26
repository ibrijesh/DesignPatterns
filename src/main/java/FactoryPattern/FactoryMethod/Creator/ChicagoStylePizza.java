package FactoryPattern.FactoryMethod.Creator;

import FactoryPattern.FactoryMethod.Product.ChicagoStyle.ChicagoCheesePizza;
import FactoryPattern.FactoryMethod.Product.ChicagoStyle.ChicagoPepperoniPizza;
import FactoryPattern.FactoryMethod.Product.ChicagoStyle.ChicagoVeggiesPizza;
import FactoryPattern.FactoryMethod.Product.Pizza;

public class ChicagoStylePizza extends PizzaStore {

    @Override
    Pizza createPizza(final String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new ChicagoCheesePizza();
            case "pepperoni" -> new ChicagoPepperoniPizza();
            case "veggies" -> new ChicagoVeggiesPizza();
            default -> null;
        };
    }
}
