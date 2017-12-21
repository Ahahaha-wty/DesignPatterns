package StrategyPattern.Fly;

import StrategyPattern.FlyBehavior;

/**
 * @Description:duck不能飞
 * @Author: wty
 * @Date: Created in 18:17 2017/12/21
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
