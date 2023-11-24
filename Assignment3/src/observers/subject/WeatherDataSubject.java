package observers.subject;

import observers.observer.WeatherDataObserver;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements IWeatherDataSubject {
    private final List<WeatherDataObserver> observers;
    private  double temperature;
    private  double humidity;
    public WeatherDataSubject(){
        this.observers = new ArrayList<>();
    }
    public List<WeatherDataObserver> getObservers() {
        return observers;
    }
    public double getTemperature() {
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(this.temperature, this.humidity);
        }
    }
    public void setValue(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
    public void description() {
        System.out.println("Temperature => " + temperature + "  Humidity => " + humidity);
    }
}
