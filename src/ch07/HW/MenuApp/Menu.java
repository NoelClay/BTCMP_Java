package ch07.HW.MenuApp;

public class Menu {
	String name;
	int price;
	String mat;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Menu(String s, int i, String s2) {
		// TODO Auto-generated constructor stub
		this(s, i);
		mat = s2;
	}
	void printInfo() {
		System.out.printf("======%s=====", this.getClass().getSimpleName());
		System.out.println();
		System.out.printf("메뉴=%s | 가격=%d", getName(), getPrice());
		//System.out.println(this.getClass().getSimpleName());
		customFunction();
		System.out.println();
	}
	void customFunction() {
		
	}
}
