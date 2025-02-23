package ObserverPattern;

import ObserverPattern.Observer.CurrentConditionDisplay;
import ObserverPattern.Observer.ForeCastDisplay;
import ObserverPattern.Subject.WeatherData;

public class MainWeather {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);

        weatherData.setMeasurement(22.80, 45.55, 70.34);
        weatherData.setMeasurement(34.60, 40.20, 56.90);

    }
}
