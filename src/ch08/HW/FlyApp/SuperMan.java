package ch08.HW.FlyApp;

public class SuperMan extends Human implements Flyer {

	public SuperMan(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

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
	

}
