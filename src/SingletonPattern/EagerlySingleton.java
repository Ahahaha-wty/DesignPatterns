package SingletonPattern;

/**
 * @Description:急切的创建实例
 * @Author: wty
 * @Date: Created in 18:34 2017/12/28
 */
public class EagerlySingleton {
    private static EagerlySingleton eagerlySingleton = new EagerlySingleton();

    private EagerlySingleton() {

    }

    public static EagerlySingleton getInstance() {
        return eagerlySingleton;
    }
}
