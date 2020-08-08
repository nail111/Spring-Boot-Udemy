package Step5_AppProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
class SayHello {
    // Full application properties: https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#core-properties
    // Now I have to use localhost:8080/mycoolapp/Hello
    @GetMapping("/Hello")
    public String SHello() {
        return "Hello World  " + LocalDateTime.now();
    }
}