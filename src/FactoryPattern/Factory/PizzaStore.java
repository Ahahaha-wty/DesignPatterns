package FactoryPattern.Factory;

import FactoryPattern.Pizza;

/**
 * @Description:工厂方法模式
 * @Author: wty
 * @Date: Created in 14:31 2017/12/28
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
