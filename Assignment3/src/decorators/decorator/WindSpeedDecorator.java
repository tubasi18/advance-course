package decorators.decorator;

public class WindSpeedDecorator extends CondimentDecorator  {
    public double windSpeed;
    public WindSpeedDecorator(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public void description() {
        System.out.println("Wind Speed  " + windSpeed +" km/h");
    }
}
