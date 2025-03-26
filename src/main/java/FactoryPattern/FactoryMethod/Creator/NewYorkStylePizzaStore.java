package FactoryPattern.FactoryMethod.Creator;

import FactoryPattern.FactoryMethod.Product.NewYorkStyle.NewYorkStyleCheesePizza;
import FactoryPattern.FactoryMethod.Product.NewYorkStyle.NewYorkStylePepperoniPizza;
import FactoryPattern.FactoryMethod.Product.NewYorkStyle.NewYorkStyleVeggiesPizza;
import FactoryPattern.FactoryMethod.Product.Pizza;

public class NewYorkStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(final String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new NewYorkStyleCheesePizza();
            case "pepperoni" -> new NewYorkStylePepperoniPizza();
            case "veggies" -> new NewYorkStyleVeggiesPizza();
            default -> null;
        };
    }
}
