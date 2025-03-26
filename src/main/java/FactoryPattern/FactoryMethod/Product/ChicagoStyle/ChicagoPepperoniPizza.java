package FactoryPattern.FactoryMethod.Product.ChicagoStyle;

import FactoryPattern.FactoryMethod.Product.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pizza in square slices");
    }
}
