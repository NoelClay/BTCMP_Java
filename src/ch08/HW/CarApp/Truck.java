package ch08.HW.CarApp;

public class Truck extends Car implements TruckModel{

	public Truck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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

}
