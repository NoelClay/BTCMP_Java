package ch05.homework.Salary;

public class SalaryManagerApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] bookArray = new Employee[6];
		
		bookArray[0] = new Employee("E001", "James", 5000, 90);
		bookArray[1] = new Employee("E002", "Victoria", 4500, 83);
		bookArray[2] = new Employee("E003", "Paige", 7000, 85);
		bookArray[3] = new Employee("E004", "Tom", 5500, 63);
		bookArray[4] = new Employee("E005", "Rose", 3800, 98);
		bookArray[5] = new Employee("E006", "Santiago", 3400, 78);

		SalaryManager bs = new SalaryManager(bookArray);
		
//		System.out.println("\n====printBookByIsbn()=====");
//		
//		System.out.println("\n====979-11-90277-42-6=====");
//		String isbn = "979-11-90277-42-6";
//		bs.printBookBuIsbn(isbn);
//		
//		System.out.println("\n====979-11-90277-42-7=====");
//		isbn = "979-11-90277-42-7";
//		bs.printBookBuIsbn(isbn);
//		
//		System.out.println("\n====printBookByBetweenPrice()=====");
//		
//		System.out.println("\n====5000 ~ 20000====");
//		int betweenMinPrice = 5000;
//		int betweenMaxPrice = 20000;
//		bs.printBooksByBetweenPrice(betweenMinPrice, betweenMaxPrice);
//		
//		System.out.println("\n====50000 ~ 200000====");
//		betweenMinPrice = 50000;
//		betweenMaxPrice = 200000;
//		bs.printBooksByBetweenPrice(betweenMinPrice, betweenMaxPrice);
//		
//		System.out.println("\n====printBooksByCategory()=====");
//		
//		System.out.println("\n====comic====");
//		String category = "comic";
//		bs.printBooksByCategory(category);
//		
//		System.out.println("\n====travel====");
//		category = "travel";
//		bs.printBooksByCategory(category);
//		
//		System.out.println("\n====food====");
//		category = "food";
//		bs.printBooksByCategory(category);
//		
//		System.out.println("\n====health====");
//		category = "health";
//		bs.printBooksByCategory(category);
//		
//		System.out.println("\n====travel====");
//		category = "travel";
//		bs.printBooksByCategory(category);
//		
//		
//		System.out.println("\n====printBooksByMaxPrice()====");
//		
//		System.out.println("\n====10000====");
//		int maxPrice = 10000;
//		bs.printBooksByMaxPrice(maxPrice);
//		
//		System.out.println("\n====2000====");
//		maxPrice = 2000;
//		bs.printBooksByMaxPrice(maxPrice);
//		
//		System.out.println("\n====printBooksByMinPrice()====");
//		
//		System.out.println("\n====15000====");
//		int minPrice = 15000;
//		bs.printBooksByMinPrice(minPrice);
//		
//		System.out.println("\n====50000====");
//		minPrice = 50000;
//		bs.printBooksByMinPrice(minPrice);
//		
//		System.out.println("\n====printBooksByTitleLike()====");
//		
//		System.out.println("\n====뉴욕====");
//		String title = "뉴욕";
//		bs.printBooksByTitleLike(title);
//		
//		System.out.println("\n====서울====");
//		title = "서울";
//		bs.printBooksByTitleLike(title);
		
		//System.out.println("\n====printBookStore()====");
		bs.printInfo();
	}

}
