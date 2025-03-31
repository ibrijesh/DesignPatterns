package FactoryPattern.AbstractFactory.factory;

import FactoryPattern.AbstractFactory.ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.ingredients.Veggies.IVeggies;

public interface PizzaIngredientFactory {
    IDough createDough();

    ICheese createCheese();

    ISauce createSauce();

    IVeggies[] createVeggies();

    IPepperoni createPepperoni();
}
