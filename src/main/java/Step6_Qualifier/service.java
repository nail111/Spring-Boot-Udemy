package Step6_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class service {

    // 1
    @Autowired
    @Qualifier("popMusic")
    private Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;

    public String playMusic1() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

    // 2
    private Music music3;
    private Music music4;

    @Autowired
    public service(@Qualifier("classicalMusic") Music music3, @Qualifier("popMusic") Music music4) {
        this.music3 = music3;
        this.music4 = music4;
    }
    public String playMusic2() {
        return " Not Playing: " + music3.getSong() + ", " + music4.getSong();
    }
}