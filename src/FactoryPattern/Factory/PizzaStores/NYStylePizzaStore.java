package FactoryPattern.Factory.PizzaStores;

import FactoryPattern.AbstractFactory.IngredientFactories.NYPizzaIngredientFactory;
import FactoryPattern.AbstractFactory.PizzaIngredientFactory;
import FactoryPattern.Factory.PizzaStore;
import FactoryPattern.Pizza;
import FactoryPattern.Pizzas.*;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:35 2017/12/28
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("NewYork Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PeppernoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
