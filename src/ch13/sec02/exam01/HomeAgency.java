package ch13.sec02.exam01;

public class HomeAgency implements Rentable<TV>{

	@Override
	public TV rent() {
		// TODO Auto-generated method stub
		return new TV();
	}

}
