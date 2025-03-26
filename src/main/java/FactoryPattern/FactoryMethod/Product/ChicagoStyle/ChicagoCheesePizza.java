package FactoryPattern.FactoryMethod.Product.ChicagoStyle;

import FactoryPattern.FactoryMethod.Product.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "Chicago Style Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
