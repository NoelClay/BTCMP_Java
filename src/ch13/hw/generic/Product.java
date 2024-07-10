package ch13.hw.generic;

import ch06.fin.hw2.*;

public class Product {

	String name;
	int price;

	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printInfo() {
		System.out.printf("======%s=====", this.getClass().getSimpleName());
		System.out.println();
		System.out.printf("제품명=%s | 가격=%s", name, DecimalUtil.decimalComma(price));
		//System.out.println(this.getClass().getSimpleName());
		customFunction();
		System.out.println();
	}
	void customFunction() {
		
	}
}
