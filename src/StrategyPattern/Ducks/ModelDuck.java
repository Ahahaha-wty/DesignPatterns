package StrategyPattern.Ducks;

import StrategyPattern.Duck;
import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.Quack;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 18:25 2017/12/21
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am modelDuck");
    }
}
