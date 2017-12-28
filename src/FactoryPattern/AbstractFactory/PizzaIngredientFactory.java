package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Ingredients.*;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:54 2017/12/28
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}
