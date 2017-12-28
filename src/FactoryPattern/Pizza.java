package FactoryPattern;

import FactoryPattern.AbstractFactory.Ingredients.Dough;
import FactoryPattern.AbstractFactory.Ingredients.Sauce;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 14:18 2017/12/28
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public ArrayList toppings = new ArrayList();
//    public void prepare() {
//        System.out.println("preparing" + name);
//        System.out.println("Tossing dough");
//        System.out.println("Adding toppings");
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("    " + toppings.get(i));
//        }
//    }

    public abstract void prepare();

    public void bake() {
        System.out.println("bake 10min");
    }

    public void cut() {
        System.out.println("cut 5min");
    }

    public void box() {
        System.out.println("box 3min");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
