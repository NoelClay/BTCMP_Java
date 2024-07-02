package ch05.homework.BookAPP;

public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookArray = new Book[5];
		
		bookArray[0] = BookService.makeBook("comic", "열혈강호", "전극진,양재현", "대원씨아이", 4500, "979-11-5754-926-9");
		bookArray[1] = BookService.makeBook("travel", "뉴욕 100배 즐기기", "홍지윤", "대원씨아이", 14400, "978-11-5754-926-9");
		bookArray[2] = BookService.makeBook("travel", "바르셀로나, 지금이 좋아", "정다운", "대원씨아이", 15000, "977-11-5754-926-9");
		bookArray[3] = BookService.makeBook("food", "오늘의 맥주", "이성준", "대원씨아이", 18000, "976-11-5754-926-9");
		bookArray[4] = BookService.makeBook("food", "버번 위스키의 모든 것", "조승원", "대원씨아이", 24000, "975-11-5754-926-9");

		BookStore bs = new BookStore(bookArray);
		bs.printBookStore();
	}

}
