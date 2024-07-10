package ch15.hw2.product;

public class DriedFruit extends Fruit {

	DriedFruit(String name, int price) {
		super(name, price);
		ice = false;
	}
	DriedFruit(String name, int price, String s) {
		super(name, price, s);
	}
}
