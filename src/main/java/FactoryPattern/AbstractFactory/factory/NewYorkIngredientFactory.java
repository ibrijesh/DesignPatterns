package FactoryPattern.AbstractFactory.Factories;

import FactoryPattern.AbstractFactory.Ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.Ingredients.Cheese.ReggianoCheese;
import FactoryPattern.AbstractFactory.Ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.Ingredients.Dough.ThinCrustDough;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.MarinaraSauce;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.Garlic;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.IVeggies;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.Mushroom;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.Onion;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.RedPepper;

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
