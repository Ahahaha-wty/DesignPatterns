package SingletonPattern;

/**
 * @Description:简单单件模式
 * @Author: wty
 * @Date: Created in 18:39 2017/12/28
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
