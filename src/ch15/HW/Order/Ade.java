package ch15.HW.Order;

public class Ade extends Menu{

	String mat;
	
	Ade(String name, int price, String name2) {
		super(name, price);
		// TODO Auto-generated constructor stub
		mat = name2;
	}

	void customFunction() {
		super.customFunction();
		System.out.printf(" | 재료=%s", mat);		
	}
}
