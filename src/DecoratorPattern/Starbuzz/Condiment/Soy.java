package DecoratorPattern.Starbuzz.Condiment;

import DecoratorPattern.Starbuzz.Beverage;
import DecoratorPattern.Starbuzz.ComdimentDecorator;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 13:50 2017/12/27
 */
public class Soy extends ComdimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Soy";
    }

    @Override
    public double cost() {
        return .99+beverage.cost();
    }
}
