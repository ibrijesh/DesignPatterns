package FactoryPattern.FactoryMethod.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + " ...");
        System.out.println("Adding " + sauce + " ...");
        System.out.print("Adding toppings:");

        for (String topping : toppings) {
            System.out.print(" " + topping);
            System.out.println();
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350c");
    }

    public void cut() {
        System.out.println("Cutting Pizza in diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
