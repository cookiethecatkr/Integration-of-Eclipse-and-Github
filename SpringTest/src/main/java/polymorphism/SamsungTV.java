package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	public SamsungTV() {
		System.out.println(" 객체생성");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println(" setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("call setPrice");
		this.price = price; 
	}
	public void powerOn() {
		System.out.println(" sm킨다");
	}
	public void powerOff() {
		System.out.println("sm끈다");
	}
	public void volumeUp() {
		System.out.println("sm소리 올림");
	}
	public void volumeDown() { 
		System.out.println(" sm volume down");
		
	
}
