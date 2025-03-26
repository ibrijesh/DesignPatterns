package FactoryPattern.NotFactoryMethod.Product;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.name = "Pepperoni Pizza";
        this.dough = "Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pizza in square slices");
    }
}
