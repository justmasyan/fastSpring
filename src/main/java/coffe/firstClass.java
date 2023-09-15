package coffe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class firstClass {
    public CoffeSeed getSeed() {
        return seed;
    }

    @Autowired
    public CoffeSeed seed;
}
