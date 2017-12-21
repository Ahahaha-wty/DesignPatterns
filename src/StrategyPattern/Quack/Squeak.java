package StrategyPattern.Quack;

import StrategyPattern.QuackBehavior;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 18:20 2017/12/21
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
