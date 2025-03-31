package FactoryPattern.AbstractFactory.factory;

import FactoryPattern.AbstractFactory.ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.ingredients.Cheese.ReggianoCheese;
import FactoryPattern.AbstractFactory.ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.ingredients.Dough.ThinCrustDough;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.ingredients.Sauce.MarinaraSauce;
import FactoryPattern.AbstractFactory.ingredients.Veggies.Garlic;
import FactoryPattern.AbstractFactory.ingredients.Veggies.IVeggies;
import FactoryPattern.AbstractFactory.ingredients.Veggies.Mushroom;
import FactoryPattern.AbstractFactory.ingredients.Veggies.Onion;
import FactoryPattern.AbstractFactory.ingredients.Veggies.RedPepper;

public class NewYorkIngredientFactory implements PizzaIngredientFactory {

    @Override
    public IDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public ICheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public IVeggies[] createVeggies() {
        IVeggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };

        return veggies;
    }

    @Override
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
