package DecoratorPattern.Starbuzz.Drinks;

import DecoratorPattern.Starbuzz.Beverage;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 11:57 2017/12/27
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
