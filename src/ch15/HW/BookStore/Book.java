package ch15.HW.BookStore;

import java.util.*;

import ch06.fin.hw2.*;

public class Book {
	String category;
	String name;
	String author;
	String publisher;
	int price;
	String isbn;
	
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
	
	Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Book(String s, int i, String s2) {
		// TODO Auto-generated constructor stub
		this(s, i);
		isbn = s2;
	}
	public Book(String string) {
		// TODO Auto-generated constructor stub
	}
	public Book(StringTokenizer st) {
		// TODO Auto-generated constructor stub
		category=st.nextToken();
		name=st.nextToken();
		author=st.nextToken();
		publisher=st.nextToken();
		price=Integer.parseInt(st.nextToken());
		isbn=st.nextToken();
	}

	void printInfo() {
		//System.out.printf("======%s=====", this.getClass().getSimpleName());
		//System.out.println();
		///System.out.printf("메뉴=%s | 가격=%s", getName(), DecimalUtil.decimalComma(getPrice()));
		System.out.println("분야="+category);
		System.out.println("제목="+name);
		System.out.println("저자="+author);
		System.out.println("춣판사="+publisher);
		System.out.println("가격="+DecimalUtil.decimalComma(price));
		System.out.println("isbn="+isbn);
		customFunction();
		System.out.println();
	}
	void customFunction() {
		
	}
}
