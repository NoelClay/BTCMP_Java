package ch07.HW.ProductAPP;

public class Fashion extends Product{

	String phone;


	Fashion(String name, int price, String phone ) {
		super(name, price);
		this.phone = phone;
	}
}
