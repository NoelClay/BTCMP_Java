package ch06.Homework;

public class Kart {

	String name = "kosa";
	String color = "gray";
	int speedUpUnit = 40;
	int speedDownUnit = 80;
	int maxSpeed = 150;
	int useBoosterSpeed = 100;
	int maxBoosterStorage = 1;
	int currentSpeed = 0;
	int currentBooster = 0;
	
	
	public Kart(String string, String string2) {
		// TODO Auto-generated constructor stub
		name = string;
		color = string2;
	}
	
	void printKartInfo() {
		System.out.printf("카트명 : %s\n", name);
		System.out.printf("카트 컬러 : %s\n", color);
		System.out.printf("속도 Up 호출 시 증가 속도 : %d(km)\n", speedUpUnit);
		System.out.printf("속도 Down 호출 시 증가 속도 : %d(km)\n", speedDownUnit);
		System.out.printf("최대 속도 : %d(km)\n", maxSpeed);
		System.out.printf("부스터 사용시 증가 속도 : %d(km)\n", useBoosterSpeed);
		System.out.printf("부스터 최대 보유 개수 : %d\n", maxBoosterStorage);
		
	}
	
	public void changeSpeed(int amount) {
		currentSpeed += amount;
		if(currentSpeed > maxSpeed) currentSpeed = maxSpeed;
		if(currentSpeed < 0) currentSpeed = 0;
	}
	
	
	public void speedUp() {
		changeSpeed(speedUpUnit);
		showState();
	}

	public void pickupBooster() {
		
		String s = " ";
		if(currentBooster >= maxBoosterStorage ) {
			s = "부스터를 더이상 추가 할 수 없습니다.";
		}
		else currentBooster++;
		showState(s);
	}
	
	public void useBooster() {

		String s = " ";
		if(currentBooster<=0) {
			s = "사용 할 수 있는 부스터가 없어요";
		}
		else {
			currentBooster--;
			changeSpeed(useBoosterSpeed);
		}
		
		showState(s);
	}
	
	public void speedDown() {
		changeSpeed(-speedDownUnit);
		showState();
	}
	
	public void showState() {
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		StackTraceElement caller = elements[elements.length - 2];
		String callerMethodName = caller.getMethodName();
		System.out.println();
		System.out.printf("[%s(%s)] %s | 속도 : %d(km) | 부스터 : %d", name, color, callerMethodName, currentSpeed, currentBooster);
	}
	
	public void showState(String warning) {
		showState();
		System.out.printf(" | %s",warning);		
	}
}
