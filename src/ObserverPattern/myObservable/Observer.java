package ObserverPattern.myObservable;

/**
 * @Description:观察者接口
 * @Author: wty
 * @Date: Created in 14:39 2017/12/25
 */
public interface Observer {
    /**
     * @Description:观察者实现update进行更新
     * @Author: Wty
     * @Date: Created om 14:46 2017/12/25
     * @param: []
     * @return: void
     */
    void update(float temperature, float humidity, float pressure);
}
