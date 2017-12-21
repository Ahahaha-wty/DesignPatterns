package StrategyPattern.Quack;

import StrategyPattern.QuackBehavior;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 18:19 2017/12/21
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }
}
