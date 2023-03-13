package sepl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("sepl/seplConfig.xml");
        System.out.println(con.getBean("calculation", Calculation.class));
    }
}
