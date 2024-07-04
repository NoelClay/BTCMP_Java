package ch08.HW.CarApp;

public class Suv extends Car implements PassengerModel, TruckModel {

	public Suv(String name) {
		super(name);
	}
	public void load() {
		// TODO Auto-generated method stub
		System.out.println(name + "에 집을 싣다");
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		System.out.println(name + "에 짐을 내리다");
	}
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
