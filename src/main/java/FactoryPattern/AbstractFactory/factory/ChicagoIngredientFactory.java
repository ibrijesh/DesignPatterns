package FactoryPattern.AbstractFactory.factory;

import FactoryPattern.AbstractFactory.ingredients.Cheese.ICheese;
import FactoryPattern.AbstractFactory.ingredients.Cheese.MozzarellaCheese;
import FactoryPattern.AbstractFactory.ingredients.Dough.IDough;
import FactoryPattern.AbstractFactory.ingredients.Dough.ThickCrustDough;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.IPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.AbstractFactory.ingredients.Sauce.ISauce;
import FactoryPattern.AbstractFactory.ingredients.Sauce.PlumTomatoSauce;
import FactoryPattern.AbstractFactory.ingredients.Veggies.BlackOlives;
import FactoryPattern.AbstractFactory.ingredients.Veggies.EggPlant;
import FactoryPattern.AbstractFactory.ingredients.Veggies.IVeggies;
import FactoryPattern.AbstractFactory.ingredients.Veggies.Spinach;

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
