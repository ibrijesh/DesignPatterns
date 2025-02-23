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
    public void update(final double temperature, final double humidity, final double pressure) {
        this.maxTemperature = Math.max(temperature, this.maxTemperature);
        this.maxHumidity = Math.max(humidity, this.maxHumidity);
        this.maxPressure = Math.max(pressure, this.maxPressure);
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
