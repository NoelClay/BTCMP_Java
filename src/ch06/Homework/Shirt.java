package ch06.Homework;

public class Shirt {

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	String name;
	String color;
	String company;
	String size;
	int price;
	
	public Shirt(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
		this(string, string2," "," ", i);
	}

	public Shirt(String string, String string2, String string3, String string4, int i) {
		// TODO Auto-generated constructor stub
		name=string;
		 color=string2;
		 company=string3;
		 size=string4;
		 price=i;
	}

	public Shirt() {
		// TODO Auto-generated constructor stub
		this(" "," "," "," ", 0);
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		name = string;
	}

	public void setColor(String string) {
		// TODO Auto-generated method stub
		color = string;
	}

	public void setCompany(String string) {
		// TODO Auto-generated method stub
		company = string;
	}

	public void setSize(String string) {
		// TODO Auto-generated method stub
		size = string;
	}

	public void setPrice(int i) {
		// TODO Auto-generated method stub
		price = i;
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.printf("이름: %s\n", getName());
		System.out.printf("컬러: %s\n", getColor());
		System.out.printf("회사: %s\n", getCompany());
		System.out.printf("사이즈: %s\n", getSize());
		System.out.printf("가격: %d\n", getPrice());
	}

}
