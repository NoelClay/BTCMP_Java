package ch06.Homework;

public class Coffee {
	private String name = "에스프레소";
	private int price = 3000;
	private String demends = "샷추가";
	
	Coffee(){
		this(" ", 0, " ");
	}
	
	Coffee(String name, int price, String demends){
		this.name = name;
		this.price = price;
		this.demends = demends;
		//ShowBill();
	}
	
	public Coffee(String string, int i) {
		// TODO Auto-generated constructor stub
		this(string, i, " ");
	}

	String getName() {return this.name;}
	int getPrice() {return this.price;}
	String getDemends() {return this.demends;}
	
	void setName(String s) {this.name = s;}
	void setPrice(int i) {this.price = i;}
	void setDemends(String s) {this.demends = s;}
	
	
	void PrintInfo() {
		System.out.println("커피 = "+name);
		System.out.println("가격 = "+price);
		if(demends == " ") {
			System.out.println();
		}
		else System.out.println("요구사항 = "+demends);
	}
}
