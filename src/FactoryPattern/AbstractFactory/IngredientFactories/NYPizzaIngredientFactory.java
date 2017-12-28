package FactoryPattern.AbstractFactory.IngredientFactories;

import FactoryPattern.AbstractFactory.Ingredients.*;
import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import com.sun.org.apache.regexp.internal.RE;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 15:17 2017/12/28
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return null;
    }
}
