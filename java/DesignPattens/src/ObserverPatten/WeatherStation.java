package ObserverPatten;

/**
 * Created by machenfei on 2017/3/1.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        WeatherDisplay1 weatherDisplay1 = new WeatherDisplay1(w);
        WeatherDisplay2 weatherDisplay2 = new WeatherDisplay2(w);

        w.setMeasurements(1.0f, 2.0f, 3.0f);
        w.setMeasurements(2.0f, 2.0f, 2.0f);
        w.deleteObserver(weatherDisplay1);
        w.setMeasurements(3.0f, 3.0f, 3.0f);
    }
}
