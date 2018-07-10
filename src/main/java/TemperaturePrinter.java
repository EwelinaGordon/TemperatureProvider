public class TemperaturePrinter {

    private TemperatureProvider temperatureProvider;

    public TemperaturePrinter(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void printTemperature(){
        int temp = temperatureProvider.getTemperature();
        System.out.println(temp);
    }
}
