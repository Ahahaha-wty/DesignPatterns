package ObserverPattern.myObservable.ObserverClass;

import ObserverPattern.myObservable.DisplayElement;
import ObserverPattern.myObservable.Observer;
import ObserverPattern.myObservable.Subject;

/**
 * @Description:
 * @Author: wty
 * @Date: Created in 15:02 2017/12/25
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condtition:" + temperature + "F degrees and" + humidity + "%humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
