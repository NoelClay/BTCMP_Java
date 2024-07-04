package ch08.HW.FlyApp;

public class Airplane implements Flyer, Transport{

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".load()");
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".unload()");
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
