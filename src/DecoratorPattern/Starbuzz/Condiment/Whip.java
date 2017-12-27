package DecoratorPattern.Starbuzz.Condiment;

import DecoratorPattern.Starbuzz.Beverage;
import DecoratorPattern.Starbuzz.ComdimentDecorator;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 13:47 2017/12/27
 */
public class Whip extends ComdimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Whip";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
