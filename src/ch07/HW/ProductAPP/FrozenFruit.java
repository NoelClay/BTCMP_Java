package ch07.HW.ProductAPP;

public class FrozenFruit extends Fruit{

	FrozenFruit(String name, int price) {
		super(name, price);
		ice = true;
	}
}
