package FactoryPattern.Pizzas;

import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import FactoryPattern.Pizza;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:44 2017/12/28
 */
public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void cut() {
        System.out.println("Cut with Square");
    }
}
