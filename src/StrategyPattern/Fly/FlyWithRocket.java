package StrategyPattern.Fly;

import StrategyPattern.FlyBehavior;

/**
 * @Description:duck用火箭飞
 * @Author: wty
 * @Date: Created in 18:33 2017/12/21
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
