package DecoratorPattern.Starbuzz;

import DecoratorPattern.Starbuzz.Condiment.Mocha;
import DecoratorPattern.Starbuzz.Condiment.Soy;
import DecoratorPattern.Starbuzz.Condiment.Whip;
import DecoratorPattern.Starbuzz.Drinks.DarkRoast;
import DecoratorPattern.Starbuzz.Drinks.Espresso;
import DecoratorPattern.Starbuzz.Drinks.HouseBlend;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 13:52 2017/12/27
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "  $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "  $" + beverage2.cost());
    }
}
