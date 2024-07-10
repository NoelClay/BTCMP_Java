package ch13.hw.generic;

public class Biz {

	public static <T extends Product> void something(T t) {
		t.printInfo();
	}
}
