package DecoratorPattern.Starbuzz.Drinks;

import DecoratorPattern.Starbuzz.Beverage;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 13:55 2017/12/27
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
