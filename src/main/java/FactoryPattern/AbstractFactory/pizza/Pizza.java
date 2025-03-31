package FactoryPattern.AbstractFactory.Ingredients;

import FactoryPattern.AbstractFactory.Ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.Ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.IVeggies;

public abstract class Pizza {
    String name;
    IDough dough;
    ICheese cheese;
    ISauce sauce;
    IPepperoni pepperoni;
    IVeggies veggies[];

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }


}
