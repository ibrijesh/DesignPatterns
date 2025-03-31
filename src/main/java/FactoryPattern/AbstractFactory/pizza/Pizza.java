package FactoryPattern.AbstractFactory.pizza;

import FactoryPattern.AbstractFactory.ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.ingredients.Veggies.IVeggies;

public abstract class Pizza {
    String name;
    IDough dough;
    ICheese cheese;
    ISauce sauce;
    IPepperoni pepperoni;
    IVeggies veggies[];

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
