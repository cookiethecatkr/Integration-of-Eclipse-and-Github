package polymorphism;

import org.springframework.stereotype.Component;

// @Component("apple")

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println(" 객체생성");
	}

	public void volumeUp() {
		System.out.println("applespeaker --- you can hear");
	}
	
	public void volumeDown() { 
		System.out.println("applespeaker --- volume down");
	}

}
