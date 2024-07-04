package ch08.HW.FlyApp;

public class Bird extends Animal implements Flyer{
	public Bird(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	public Bird(int age, int i) {
		super(age);
		wings = i;
		// TODO Auto-generated constructor stub
	}

	int wings;

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".takeoff()");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".fly()");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".land()");
	}
	
	public void eat(){
		System.out.println(this.getClass().getSimpleName() + ".eat()");
	}
	
	public void printInfo() {
		System.out.println("나이"+age +" : 날개수="+wings);
	}
}
