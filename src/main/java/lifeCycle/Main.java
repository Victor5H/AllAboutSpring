package lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("lifeCycle/lifeCycle.xml");
        con.registerShutdownHook();
        System.out.println(con.getBean("pb1"));
        System.out.println();
        System.out.println(con.getBean("cheque"));

    }
}
