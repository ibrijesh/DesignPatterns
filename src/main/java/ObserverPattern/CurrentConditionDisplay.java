package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
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
