package FactoryPattern.FactoryMethod.Product.NewYorkStyle;

import FactoryPattern.FactoryMethod.Product.Pizza;

public class NewYorkStylePepperoniPizza extends Pizza {
    public NewYorkStylePepperoniPizza() {
        this.name = "New York Style Pepperoni Pizza";
        this.dough = "Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pizza in square slices");
    }
}
