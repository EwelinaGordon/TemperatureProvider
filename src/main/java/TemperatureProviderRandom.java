import java.util.Random;

public class TemperatureProviderRandom implements TemperatureProvider {

    public int getTemperature(){
        Random random = new Random();
        int temp = random.nextInt(60) - 25; //-25 -> 35
        return temp;
    }
}
