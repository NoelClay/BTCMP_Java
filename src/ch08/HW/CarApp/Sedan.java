package ch08.HW.CarApp;

public class Sedan extends Car implements PassengerModel{

	public Sedan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOn() {
		// TODO Auto-generated method stub
		System.out.println(name + "에 타다");
	}

	@Override
	public void getOff() {
		// TODO Auto-generated method stub
		System.out.println(name + "에 내리다");
	}

}
