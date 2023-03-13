package stereotypeAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereotypeAnno/stereo.xml");
        System.out.println(con.getBean("student").hashCode());
        System.out.println(con.getBean("student").hashCode());

        Glass g1,g2,pg1,pg2;
        g1=con.getBean("glass1", Glass.class);
        g2=con.getBean("glass1", Glass.class);

        pg1=con.getBean("glass2", Glass.class);
        pg2=con.getBean("glass2", Glass.class);

        System.out.println(g1.hashCode()+" " +g2.hashCode()+" "+pg1.hashCode()+" "+pg2.hashCode());

    }
}
