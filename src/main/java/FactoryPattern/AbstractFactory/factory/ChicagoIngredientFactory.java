package FactoryPattern.AbstractFactory.Factories;

import FactoryPattern.AbstractFactory.Ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.Ingredients.Cheese.MozzarellaCheese;
import FactoryPattern.AbstractFactory.Ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.Ingredients.Dough.ThickCrustDough;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.Ingredients.Sauce.PlumTomatoSauce;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.BlackOlives;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.EggPlant;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.IVeggies;
import FactoryPattern.AbstractFactory.Ingredients.Veggies.Spinach;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public IVeggies[] createVeggies() {

        IVeggies veggies[] = {
                new BlackOlives(),
                new Spinach(),
                new EggPlant()
        };

        return veggies;

    }

    @Override
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
