package ch13.hw.generic;

public class FrozenFruit extends Fruit{

	FrozenFruit(String name, int price) {
		super(name, price);
		ice = true;
	}
}
