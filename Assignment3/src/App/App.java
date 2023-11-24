package App;



import decorators.decorator.PrecipitationDecorator;
import decorators.decorator.TemperatureUnitsDecorator;

import decorators.decorator.WindSpeedDecorator;
import enums.TemperatureTypes;
import observers.observer.CurrentConditionsDisplay;
import observers.observer.StatisticsDisplay;
import observers.subject.WeatherDataSubject;

public class App {
    public static void main(String[] args) {
        WeatherDataSubject subject = new WeatherDataSubject();
        WeatherDataSubject subject1 = new WeatherDataSubject();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(subject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subject);

        StatisticsDisplay statisticsDisplay1 = new StatisticsDisplay(subject1);

        subject.setValue(20,30);
        subject.setValue(30,30);

        TemperatureUnitsDecorator temperatureUnitsDecorator = new TemperatureUnitsDecorator(subject, TemperatureTypes.FAHRENHEIT);
        WindSpeedDecorator windSpeedDecorator = new WindSpeedDecorator(15);
        PrecipitationDecorator precipitationDecorator = new PrecipitationDecorator("Snow");

        CurrentConditionsDisplay currentConditionsDisplay1 = new CurrentConditionsDisplay(subject1);
        subject1.setValue(40,80);
        TemperatureUnitsDecorator temperatureUnitsDecorator1 = new TemperatureUnitsDecorator(subject1, TemperatureTypes.CELSIUS);
        WindSpeedDecorator windSpeedDecorator1 = new WindSpeedDecorator(20);
        PrecipitationDecorator precipitationDecorator1 = new PrecipitationDecorator("Rain");

        currentConditionsDisplay.description();
        temperatureUnitsDecorator.description();
        windSpeedDecorator.description();
        precipitationDecorator.description();
        System.out.println("-------------------------------------");
        currentConditionsDisplay1.description();
        temperatureUnitsDecorator1.description();
        windSpeedDecorator1.description();
        precipitationDecorator1.description();
        System.out.println("-------------------------------------");

        statisticsDisplay.getDescription();

    }
}


