package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

import java.util.*;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;
    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurement(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }


    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
