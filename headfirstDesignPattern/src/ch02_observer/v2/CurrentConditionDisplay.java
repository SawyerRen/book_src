package ch02_observer.v2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
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

    private void display() {
        System.out.println(temperature + "," + humidity);
    }
}
