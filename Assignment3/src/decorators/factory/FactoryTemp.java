package decorators.factory;
import enums.TemperatureTypes;
import static enums.TemperatureTypes.*;

public class FactoryTemp {
    public  static void checkTemperature(double temperature, TemperatureTypes type){
        if (type.equals(FAHRENHEIT)) {
            temperature = (temperature * 9/5) + 32;
            System.out.println("The Temperature in Fahrenheit => " + temperature);
        }
        else if(type.equals(CELSIUS)) {
            System.out.println("The Temperature in Celsius => " + temperature);
        }
    }
//        if (type.equals("Fahrenheit")) {
//            temperature = (temperature * 9/5) + 32;
//        System.out.println("The Temperature in Fahrenheit = " + temperature);
//        return temperature;
//    }
//        else if(type.equals("Celsius")) {
//        System.out.println("The Temperature in Celsius = " + temperature);
//        return temperature;
}

