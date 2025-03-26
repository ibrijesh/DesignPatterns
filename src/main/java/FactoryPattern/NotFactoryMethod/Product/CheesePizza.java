package FactoryPattern.NotFactoryMethod.Product;


public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
