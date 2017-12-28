package FactoryPattern.SimpleFactory;

import FactoryPattern.Pizza;

/**
 * @Description:简单工厂模式的pizzaStore
 * @Author: wty
 * @Date: Created in 14:16 2017/12/28
 */
public class SimplePizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
