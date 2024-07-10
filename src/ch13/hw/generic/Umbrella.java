package ch13.hw.generic;

public class Umbrella extends Fashion {
	int weight;

	Umbrella(String name, int price, int weight, String phone) {
		super(name, price, phone);
		this.weight = weight;
	}
	
	void customFunction() {
		super.customFunction();
		System.out.printf(" | 무게=%d | A/s=%s", weight, phone);
	}

}
