import java.io.*;

public class Main {
    public static void main(String[] args) {
        TemperaturePrinter printer = new TemperaturePrinter(new FileTemperatureProvider());
        printer.printTemperature();

    }
}
