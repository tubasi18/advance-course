package observers.observer;

import observers.subject.IWeatherDataSubject;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    private final IWeatherDataSubject subject;

    public CurrentConditionsDisplay(IWeatherDataSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("The last update for temperature : " + temperature + " && humidity : " +  humidity);
    }
    public void description() {
        System.out.println("Temperature => " + subject.getTemperature() + "  Humidity => " + subject.getHumidity());
    }
}

