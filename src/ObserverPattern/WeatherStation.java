package ObserverPattern;

import ObserverPattern.myObservable.ObservableClass.WeatherData;
import ObserverPattern.myObservable.ObserverClass.CurrentConditionDisplay;

/**
 * @Description:气象站测试类
 * @Author: wty
 * @Date: Created in 15:07 2017/12/25
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
//        weatherStation.myObservableTest();
        weatherStation.javaObservableTest();
    }

    /**
     * @Description:myObservable测试
     * @Author: Wty
     * @Date: Created om 15:10 2017/12/25
     * @param: []
     * @return: void
     */
    public void myObservableTest() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }

    public void javaObservableTest() {
        ObserverPattern.JavaObservable.WeatherData weatherData = new ObserverPattern.JavaObservable.WeatherData();
        ObserverPattern.JavaObservable.CurrentConditionDisplay currentConditionDisplay = new ObserverPattern.JavaObservable.CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78,90,29.2f);

    }
}
