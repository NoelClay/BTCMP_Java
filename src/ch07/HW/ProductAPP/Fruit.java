package ch07.HW.ProductAPP;

public class Fruit extends Product{
	
	boolean ice;

	

	Fruit(String name, int price) {
		super(name, price);
	}
	
	Fruit(String name, int price, String s) {
		super(name, price);
		ice = (s == "냉장(종이포장)" ? false: true );
	}
	
	void customFunction() {
		super.customFunction();
		System.out.printf(" | 포장타입=%s", ice ? "냉동(종이포장)":"상온(종이포장)");		
	}
}
