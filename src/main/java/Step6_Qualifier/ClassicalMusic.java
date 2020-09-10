package Step6_Qualifier;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical Music";
    }
}