package ch07.sec02;

public class Phone {
	public String model;
	public String color;

	public Phone(String s, String s2) {
		this.model = s;
		this.color = s2;
	}
	
	public void bell() {
		System.out.println("벨울려");
	}
	
	public void sendVoice(String m) {
		System.out.println("나: "+m);
	}
	
	public void receiveVoice(String m) {
		System.out.println("너: "+m);
	}
	
	public void hangUp() {
		System.out.println("전화끊어");
	}
}
