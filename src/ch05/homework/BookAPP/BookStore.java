package ch05.homework.BookAPP;

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

}
