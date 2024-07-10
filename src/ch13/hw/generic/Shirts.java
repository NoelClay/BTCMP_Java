package ch13.hw.generic;

public class Shirts extends Fashion {
	String size;

	Shirts(String name, int price, String size, String phone) {
		super(name, price, phone);
		this.size = size;
	}
	
	void customFunction() {
		super.customFunction();
		System.out.printf(" | 크기=%s | A/S=%s", size, phone);
	}
	

}
