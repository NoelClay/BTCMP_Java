package ch06.fin.hw2;

public class Menu {
	String name;
	int price;
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
	public Menu(String name2, int price2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.price = price2;
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("메뉴="+name+ " | 가격="+DecimalUtil.decimalComma(price));
	}
}
