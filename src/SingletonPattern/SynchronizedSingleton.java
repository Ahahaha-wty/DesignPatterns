package SingletonPattern;

/**
 * @Description:使用synchronized避免多线程
 * @Author: wty
 * @Date: Created in 18:22 2017/12/28
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton() {

    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }
}
