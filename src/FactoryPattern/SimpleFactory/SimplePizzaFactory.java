package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza;
import FactoryPattern.Pizzas.CheesePizza;
import FactoryPattern.Pizzas.ClamPizza;
import FactoryPattern.Pizzas.PeppernoniPizza;
import FactoryPattern.Pizzas.VeggiePizza;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:17 2017/12/28
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
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
