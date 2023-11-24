package observers.subject;



import observers.observer.WeatherDataObserver;


public interface IWeatherDataSubject{
    void registerObserver(WeatherDataObserver observer);
    void removeObserver(WeatherDataObserver observer);
    void notifyObservers();
    double getTemperature();
    double getHumidity();
    void setHumidity(double humidity);
    void setTemperature(double temperature);
}
