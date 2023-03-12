package autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("autowiring/annotations/annotationAuto.xml");
        System.out.println(con.getBean("emp"));
    }
}
