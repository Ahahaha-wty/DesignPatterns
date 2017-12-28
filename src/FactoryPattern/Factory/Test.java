package FactoryPattern.Factory;

import FactoryPattern.Factory.PizzaStores.NYStylePizzaStore;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:37 2017/12/28
 */
public class Test {
    public static void main(String[] args) {
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
    }
}
