package StrategyPattern;

import StrategyPattern.Ducks.ModelDuck;
import StrategyPattern.Fly.FlyWithRocket;

/**
 * @Description:duck测试类
 * @Author: wty
 * @Date: Created in 18:31 2017/12/21
 */
public class test {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();
    }
}
