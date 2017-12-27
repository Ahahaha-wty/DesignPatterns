package DecoratorPattern.Starbuzz;

/**
 * @Description:饮料抽象类
 * @Author: wty
 * @Date: Created in 10:14 2017/12/27
 */
public abstract class Beverage {
    protected String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
