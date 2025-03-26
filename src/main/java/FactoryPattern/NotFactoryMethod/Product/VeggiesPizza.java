package FactoryPattern.NotFactoryMethod.Product;

public class VeggiesPizza extends Pizza {
    public VeggiesPizza() {
        this.name = "Veggies Pizza";
        this.dough = "Medium Crust Dough";
        this.sauce = "Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }


    @Override
    public void bake() {
        System.out.println("Bake for 35 minutes at 380c");
    }
}
