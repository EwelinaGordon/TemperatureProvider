import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        TemperaturePrinter printer = new TemperaturePrinter(new FileTemperatureProvider());
//        printer.printTemperature();

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TemperaturePrinter printer = context.getBean(TemperaturePrinter.class);
        printer.printTemperature();

    }
}
