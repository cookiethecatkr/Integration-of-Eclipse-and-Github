package polymorphism;

import org.springframework.stereotype.Component;

// @Component("sony")

public class SonySpeaker implements Speaker {

	
	public SonySpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println(" 객체생성");
	}

	public void volumeUp() {
		System.out.println("sony --- you can hear");
	}
	
	public void volumeDown() { 
		System.out.println("sony --- volume down");
	}
}
