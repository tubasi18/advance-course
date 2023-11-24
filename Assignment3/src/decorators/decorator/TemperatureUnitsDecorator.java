package decorators.decorator;
import decorators.factory.FactoryTemp;


import enums.TemperatureTypes;
import observers.subject.IWeatherDataSubject;


    public class TemperatureUnitsDecorator extends CondimentDecorator {
    private final IWeatherDataSubject subject;
    private final TemperatureTypes unit;
    public TemperatureUnitsDecorator(IWeatherDataSubject subject, TemperatureTypes type) {
        this.subject = subject;
        this.unit = type;
    }
    private void checkTemperatureUnits(){
       FactoryTemp.checkTemperature(subject.getTemperature(), unit);
//     observer.setTemperature( FactoryTemp.checkTemperature(getTemperature(), unit));
    }
    @Override
    public void description() {
        checkTemperatureUnits();
    }
}
