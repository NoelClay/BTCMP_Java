package ch15.HW.BookStore;

import java.util.*;

public class BookStore {

	List<Book> lb;
	
	
	public BookStore(List<Book> bookList) {
		// TODO Auto-generated constructor stub
		lb = bookList;
	}
	
	void printBookStore() {
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			System.out.println(i +".");
			i++;
			lb.get(j).printInfo();
		}
	}

	public static Coffee MakeCoffee(String s, int i, String s2) {
		return new Coffee(s, i, s2);
	}

	public static Ade MakeAde(String s, int i, String s2) {
		// TODO Auto-generated method stub
		return new Ade(s, i, s2);
	}

	public void printBooksByCategory(String category) {
		// TODO Auto-generated method stub
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			if(lb.get(j).category.equals(category)) {
				System.out.println(i +".");
				i++;
				lb.get(j).printInfo();
			}

		}
	}

	public void printBoooksByIsbn(String isbn) {
		// TODO Auto-generated method stub
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			if(lb.get(j).isbn.equals(isbn)) {
				System.out.println(i +".");
				i++;
				lb.get(j).printInfo();
			}

		}
		
	}

	public void printBooksByMaxPrice(int maxPrice) {
		// TODO Auto-generated method stub
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			if(lb.get(j).price <= maxPrice) {
				System.out.println(i +".");
				i++;
				lb.get(j).printInfo();
			}

		}
	}

	public void printBooksByMinPrice(int minPrice) {
		// TODO Auto-generated method stub
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			if(lb.get(j).price >= minPrice) {
				System.out.println(i +".");
				i++;
				lb.get(j).printInfo();
			}

		}
	}

	public void printBooksByBetweenPrice(int bMinP, int bMaxP) {
		// TODO Auto-generated method stub
		int i = 1;
		for(int j = 0; j<lb.size();j++) {
			if(lb.get(j).price <= bMaxP && lb.get(j).price >= bMinP) {
				System.out.println(i +".");
				i++;
				lb.get(j).printInfo();
			}

		}
	}
}
