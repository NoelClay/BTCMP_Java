package ch05.homework.BookAPP2.copy;

public class BookStore {
	Book[] bookArray;

	Book[] getBookArray() {
		return bookArray;
	}

	void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	BookStore(Book[] bookArray) {
		this.bookArray = bookArray;
	}
	
	void printBookStore() {
		for(int i = 0; i<bookArray.length; i++) {
			System.out.println(i+1+".");
			bookArray[i].printInfo();
		}
	}

	public void printBookBuIsbn(String isbn) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getStringISBN() == isbn) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
	}

	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getIntPrice() >= betweenMinPrice && bookArray[i].getIntPrice() <= betweenMaxPrice) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
		
	}

	public void printBooksByCategory(String category) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getStringCategory() == category) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
		
	}

	public void printBooksByMaxPrice(int maxPrice) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getIntPrice() < maxPrice) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
		
	}

	public void printBooksByTitleLike(String title) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getStringBook().indexOf(title) != -1) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
	
	}

	public void printBooksByMinPrice(int minPrice) {
		// TODO Auto-generated method stub
		int cnt = 1;
		boolean isValid = false;
		for(int i = 0; i<bookArray.length; i++) {
			if(bookArray[i].getIntPrice() > minPrice) {
				System.out.println(cnt+".");
				bookArray[i].printInfo();
				cnt++;
				isValid = true;
			}
		}
		if(!isValid) System.out.println("No data available.");
	
	}
	
}

