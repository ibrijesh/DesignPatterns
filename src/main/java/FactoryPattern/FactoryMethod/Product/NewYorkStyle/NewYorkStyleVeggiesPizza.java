package FactoryPattern.FactoryMethod.Product.NewYorkStyle;


import FactoryPattern.FactoryMethod.Product.Pizza;

public class NewYorkStyleVeggiesPizza extends Pizza {
    public NewYorkStyleVeggiesPizza() {
        this.name = "New York Style Veggies Pizza";
        this.dough = "Medium Crust Dough";
        this.sauce = "Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 35 minutes at 380c");
    }
}
