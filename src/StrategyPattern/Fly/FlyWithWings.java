package StrategyPattern.Fly;

import StrategyPattern.FlyBehavior;

/**
 * @Description:用翅膀飞
 * @Author: wty
 * @Date: Created in 18:16 2017/12/21
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
