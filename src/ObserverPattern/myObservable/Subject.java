package ObserverPattern.myObservable;

/**
 * @Description:可观察者接口
 * @Author: wty
 * @Date: Created in 14:38 2017/12/25
 */
public interface Subject {
    /**
     * @Description:注册观察者
     * @Author: Wty
     * @Date: Created om 14:44 2017/12/25
     * @param: [o]
     * @return: void
     */
    void registerObserver(Observer o);
    /**
     * @Description:移除观察者
     * @Author: Wty
     * @Date: Created om 14:45 2017/12/25
     * @param: [o]
     * @return: void
     */
    void removeObserver(Observer o);
    /**
     * @Description:状态改变通知观察者
     * @Author: Wty
     * @Date: Created om 14:45 2017/12/25
     * @param: []
     * @return: void
     */
    void notifyObservers();
}
