package FactoryPattern.AbstractFactory.store;

import FactoryPattern.AbstractFactory.factory.ChicagoIngredientFactory;
import FactoryPattern.AbstractFactory.factory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.pizza.CheesePizza;
import FactoryPattern.AbstractFactory.pizza.PepperoniPizza;
import FactoryPattern.AbstractFactory.pizza.Pizza;
import FactoryPattern.AbstractFactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(final String item) {
        Pizza pizza = null;

        System.out.println(item);

        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        return switch (item.toLowerCase()) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                yield pizza;
            }
            case "veggies" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggies  Pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                yield pizza;
            }
            default -> null;
        };
    }
}
