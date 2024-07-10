package ch15.hw2.product;

public class FrozenFruit extends Fruit{

	FrozenFruit(String name, int price) {
		super(name, price);
		ice = true;
	}
}
