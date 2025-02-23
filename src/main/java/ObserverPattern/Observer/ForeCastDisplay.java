package ObserverPattern.Observer;

import ObserverPattern.DisplayElement;
import ObserverPattern.Subject.WeatherData;

public class ForeCastDisplay implements Observer, DisplayElement {
    private double maxTemperature;
    private double maxHumidity;
    private double maxPressure;
    private WeatherData weatherData;

    public ForeCastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.maxTemperature = Math.max(weatherData.getTemperature(), this.maxTemperature);
        this.maxHumidity = Math.max(weatherData.getHumidity(), this.maxHumidity);
        this.maxPressure = Math.max(weatherData.getPressure(), this.maxPressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("ForeCastDisplay: {" +
                "maxTemperature=" + maxTemperature +
                ", maxHumidity=" + maxHumidity +
                ", maxPressure=" + maxPressure +
                '}');
    }
}
