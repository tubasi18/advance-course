package decorators.decorator;

public class PrecipitationDecorator extends CondimentDecorator {
    public  String precipitation ;
    public PrecipitationDecorator(String precipitation) {
        this.precipitation = precipitation;
    }
    @Override
    public void description() {
        System.out.println("The Weather is " + precipitation );
    }
}
