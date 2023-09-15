package coffe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class secondClass {
    public CoffeSeed getSeed() {
        return seed;
    }

    @Autowired
    public CoffeSeed seed;
}
