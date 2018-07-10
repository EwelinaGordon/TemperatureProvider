public class TemperaturePrinter {

    public void printTemperature(){
        TemperatureProviderRandom temperatureProvider = new TemperatureProviderRandom();
        int temp = temperatureProvider.getTemperature(61, 25);
        System.out.println(temp);
    }
}
