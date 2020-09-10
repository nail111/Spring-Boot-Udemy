package Step4_Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}


@RestController
@PropertySource("Step4.properties")
class SayHello {

    @Value("${name}")
    private String name;

    @Value("${year}")
    private int year;

    @GetMapping("/Samsung")
    public String getInfo() {
        return name + " " + year;
    }
}