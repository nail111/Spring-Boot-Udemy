package Step2_Actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

@RestController
@PropertySource("Step2.properties")
class Demo {
   // /health, /info, /beans, /mappings and so on
    // FULL list of actuator: https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html
    @RequestMapping("/404")
    public int found() {
        return 404;
    }
}