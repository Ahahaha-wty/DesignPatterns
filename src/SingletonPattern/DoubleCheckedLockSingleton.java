package SingletonPattern;

/**
 * @Description:用双重检查锁
 * @Author: wty
 * @Date: Created in 18:36 2017/12/28
 */
public class DoubleCheckedLockSingleton {
    private volatile static DoubleCheckedLockSingleton doubleCheckedLockSingleton;

    private DoubleCheckedLockSingleton() {

    }

    public static DoubleCheckedLockSingleton getInstance() {
        if (doubleCheckedLockSingleton == null) {
            synchronized (DoubleCheckedLockSingleton.class) {
                if (doubleCheckedLockSingleton == null) {
                    doubleCheckedLockSingleton = new DoubleCheckedLockSingleton();
                }
            }
        }
        return doubleCheckedLockSingleton;
    }
}
