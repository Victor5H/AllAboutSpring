package stereotypeAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereotypeAnno/stereo.xml");
        System.out.println(con.getBean("student"));

    }
}
