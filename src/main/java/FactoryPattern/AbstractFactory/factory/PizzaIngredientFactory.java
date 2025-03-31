package FactoryPattern.AbstractFactory.Factories;

import FactoryPattern.AbstractFactory.Ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.Ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.IVeggies;

public interface PizzaIngredientFactory {
    IDough createDough();

    ICheese createCheese();

    ISauce createSauce();

    IVeggies[] createVeggies();

    IPepperoni createPepperoni();
}
