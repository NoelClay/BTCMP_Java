package ch07.sec02;

public class SmartPhone extends Phone {

	public boolean wifi;
	
	public SmartPhone(String s, String s2) {
		super(s, s2);
		// TODO Auto-generated constructor stub
		
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이변경");
	}
	public void internet() {
		if(this.wifi) {
			System.out.println("인터넷 연결합니다.");
		}
		else	System.out.println("와이파이먼저 켜주세요");
	}

}
