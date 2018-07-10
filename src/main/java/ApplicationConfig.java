import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TemperatureProvider temperatureProvider(){
        System.out.println("Tworzę TemperatureProvider");
        TemperatureProvider provider = new FileTemperatureProvider();
        return provider;
    }


    @Bean
    public TemperaturePrinter messagePrinter(TemperatureProvider provider){
        System.out.println("Tworzę TemperaturePrinter");
        TemperaturePrinter printer = new TemperaturePrinter(provider);
        return printer;
    }
}
