package ObserverPattern.Observer;

import ObserverPattern.DisplayElement;
import ObserverPattern.Subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }


    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay: {" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }
}
