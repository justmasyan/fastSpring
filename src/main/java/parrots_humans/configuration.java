package parrots_humans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class configuration {
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Human human(@Qualifier("parrot1") Parrot parrot){
        Human h = new Human();
        h.setGender("Male");
        h.setParrot(parrot);
        return h;
    }
}
