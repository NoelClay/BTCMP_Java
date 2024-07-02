package ch05.homework.BookAPP;

public class Book {
	String stringCategory;
	String stringBook;
	String stringAuthor;
	String stringPublishser;
	int intPrice;
	String stringISBN;
	
	String getStringCategory() {
		return stringCategory;
	}
	void setStringCategory(String stringCategory) {
		this.stringCategory = stringCategory;
	}
	String getStringBook() {
		return stringBook;
	}
	void setStringBook(String stringBook) {
		this.stringBook = stringBook;
	}
	String getStringAuthor() {
		return stringAuthor;
	}
	void setStringAuthor(String stringAuthor) {
		this.stringAuthor = stringAuthor;
	}
	String getStringPublishser() {
		return stringPublishser;
	}
	void setStringPublishser(String stringPublishser) {
		this.stringPublishser = stringPublishser;
	}
	int getIntPrice() {
		return intPrice;
	}
	void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	String getStringISBN() {
		return stringISBN;
	}
	void setStringISBN(String stringISBN) {
		this.stringISBN = stringISBN;
	}
	
	Book(String stringCategory, String stringBook, String stringAuthor, String stringPublishser, int intPrice,
			String stringISBN) {
		this.stringCategory = stringCategory;
		this.stringBook = stringBook;
		this.stringAuthor = stringAuthor;
		this.stringPublishser = stringPublishser;
		this.intPrice = intPrice;
		this.stringISBN = stringISBN;
	}
	String getKorCategory() {
		String result;
		switch(stringCategory) {

		case "comic" -> result = "만화";
		case "travel" -> result = "여행";
		case "food" -> result = "음식";
		case "health" -> result = "건강";
		case "pc" -> result = "컴퓨터";
		default -> result = "기타";		
		}
		return result;
	}
	void printInfo() {
		System.out.println("분야="+getKorCategory());
		System.out.println("제목="+getStringBook());
		System.out.println("저자="+getStringAuthor());
		System.out.println("출판사="+getStringPublishser());
		System.out.println("가격="+getIntPrice()+"(원)");
		System.out.println("isbn="+getStringISBN());
	}
	
	
	
}
