package ObserverPattern.JavaObservable;

import ObserverPattern.myObservable.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:用java内置的observer实现观察者
 * @Author: wty
 * @Date: Created in 15:27 2017/12/25
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Condtition:" + temperature + "F degrees and" + humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
