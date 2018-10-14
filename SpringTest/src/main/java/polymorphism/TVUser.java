package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public TVUser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); 
	  
        TV tv = (TV)factory.getBean("tv");
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
        
        factory.close();
	
	
	
	}

}
