package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(Configs.class);
        System.out.println(con.getBean("emp"));
        System.out.println(con.getBean("Employee"));
    }
}
