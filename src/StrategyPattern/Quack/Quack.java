package StrategyPattern.Quack;

import StrategyPattern.QuackBehavior;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 18:18 2017/12/21
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
