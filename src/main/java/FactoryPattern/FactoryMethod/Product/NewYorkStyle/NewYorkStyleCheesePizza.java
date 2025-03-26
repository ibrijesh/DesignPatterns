package FactoryPattern.FactoryMethod.Product.NewYorkStyle;

import FactoryPattern.FactoryMethod.Product.Pizza;

public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        this.name = "New York Style Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
