package ch15.HW.Order;

public class Coffee extends Menu{

	String mat;
	
	Coffee(String name, int price, String name2) {
		super(name, price);
		// TODO Auto-generated constructor stub
		mat = name2;
	}

	void customFunction() {
		super.customFunction();
		System.out.printf(" | 원두=%s", mat);		
	}
}
