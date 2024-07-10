package ch13.sec02.exam01;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
