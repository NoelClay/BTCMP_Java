package ch15.hw2.product;

public class Biz {

	public static <T extends Product> void something(T t) {
		t.printInfo();
	}
}
