package DecoratorPattern.Starbuzz.Drinks;

import DecoratorPattern.Starbuzz.Beverage;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 11:59 2017/12/27
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
