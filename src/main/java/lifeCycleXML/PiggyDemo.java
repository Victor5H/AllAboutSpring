package lifeCycleXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PiggyDemo {
    public static void main(String[] args) {
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("xmlBased/lifeCycleXML.xml");

        System.out.println(con.getBean("pb1"));
        con.registerShutdownHook();
    }
}
