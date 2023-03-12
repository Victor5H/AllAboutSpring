package xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("xmlBased/xmlConfig.xml");
		System.out.println(con.getBean("agent", Agent.class));
		System.out.println(con.getBean("maya"));
	}

}
