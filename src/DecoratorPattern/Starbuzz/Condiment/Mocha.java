package DecoratorPattern.Starbuzz.Condiment;

import DecoratorPattern.Starbuzz.Beverage;
import DecoratorPattern.Starbuzz.ComdimentDecorator;

/**
 * @Description:Mocha调料
 * @Author: wty
 * @Date: Created in 12:01 2017/12/27
 */
public class Mocha extends ComdimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
