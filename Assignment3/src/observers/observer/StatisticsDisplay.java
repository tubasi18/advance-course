package observers.observer;

import observers.subject.IWeatherDataSubject;

public  class StatisticsDisplay implements WeatherDataObserver {
    double avgTemperature = 0;
    double avgHumidity = 0;
    double counter = 0;
    public StatisticsDisplay(IWeatherDataSubject subject) {
        subject.registerObserver(this);
    }
    @Override
    public void update(double temperature, double humidity) {
        avgTemperature += temperature;
        avgHumidity += humidity;
        counter++;
    }
    public void getDescription() {
        System.out.println("Average Temperature => " + avgTemperature / counter + " , Average Humidity => " + avgHumidity / counter);
    }

}

