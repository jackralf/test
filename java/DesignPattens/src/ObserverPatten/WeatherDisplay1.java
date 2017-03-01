package ObserverPatten;


import java.util.*;

/**
 * Created by machenfei on 2017/3/1.
 */
public class WeatherDisplay1 implements java.util.Observer, DisplayElement {
    public static final String TAG = WeatherDisplay1.class.getSimpleName();
    private Observable observable;
    private float temperature;
    private float humidity;

    WeatherDisplay1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(TAG + " Temperture :" + temperature + " , Humidity:" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }
}
