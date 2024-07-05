package ch09.HW2.Drink;

public class Water implements Drink{

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + "를 마시다");

	}

}
