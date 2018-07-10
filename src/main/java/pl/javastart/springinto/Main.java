package pl.javastart.springinto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        pl.javastart.springinto.TemperaturePrinter printer = new pl.javastart.springinto.TemperaturePrinter(new pl.javastart.springinto.FileTemperatureProvider());
//        printer.printTemperature();

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TemperaturePrinter printer = context.getBean(TemperaturePrinter.class);
        printer.printTemperature();

    }
}
