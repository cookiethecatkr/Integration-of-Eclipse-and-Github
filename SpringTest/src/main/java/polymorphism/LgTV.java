package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	@Autowired
		@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV() {
		// TODO Auto-generated constructor stub
		System.out.println("lg constructor generated");
	}
	public void powerOn() {
		System.out.println(" lg킨다");
	}
	public void powerOff() {
		System.out.println("lg끈다");
	}
	public void volumeUp() {
		System.out.println("lg소리 올림");
	}
	public void volumeDown() { 
		System.out.println(" lg volume down");
	}

}
