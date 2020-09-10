package Step6_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private service Service;

    @GetMapping
    public String gg() {
        return Service.playMusic1() + Service.playMusic2();
    }
}