package main;

import Aspects.CommentService;
import coffe.firstClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(CommentService.class.getName());
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(configuration.class);

        var x1 = context.getBean(firstClass.class);
        System.out.println(x1.hashCode());
        x1 = context.getBean(firstClass.class);
        System.out.println(x1.hashCode());



    }
}
