import java.util.Random;

public class TemperatureProviderRandom {

    public int getTemperature(int number, int diff){
        Random random = new Random();
        int temp = random.nextInt(number + diff + 1) - diff; //-25 -> 35
        return temp;
    }
}
