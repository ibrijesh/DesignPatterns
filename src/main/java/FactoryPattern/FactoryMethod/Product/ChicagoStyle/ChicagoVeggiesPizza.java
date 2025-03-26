package FactoryPattern.FactoryMethod.Product.ChicagoStyle;

import FactoryPattern.FactoryMethod.Product.Pizza;


public class ChicagoVeggiesPizza extends Pizza {
    public ChicagoVeggiesPizza() {
        this.name = "Chicago Style Veggies Pizza";
        this.dough = "Medium Crust Dough";
        this.sauce = "Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 35 minutes at 380c");
    }
}
