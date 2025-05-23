package FactoryPattern.AbstractFactory.store;

import FactoryPattern.AbstractFactory.factory.NewYorkIngredientFactory;
import FactoryPattern.AbstractFactory.factory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.pizza.CheesePizza;
import FactoryPattern.AbstractFactory.pizza.PepperoniPizza;
import FactoryPattern.AbstractFactory.pizza.Pizza;
import FactoryPattern.AbstractFactory.pizza.VeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(final String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NewYorkIngredientFactory();

        return switch (item.toLowerCase()) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                yield pizza;
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggies  Pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                yield pizza;
            }
            default -> null;
        };
    }
}
