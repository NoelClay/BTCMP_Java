package ch15.HW.BookStore;

import java.util.*;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] contents = {
				"comic/열혈강호/전극진-양재현/대원씨아이/4500/979-11-5754-926-9",
				"travel/뉴욕 100배 즐기기/홍지윤/알에이치코리아/14400/978-89-255-8673-1",
				"travel/바르셀로나 지금이 좋아/정다운/중앙북스/15000/978-89-991-7580-0",
				"food/오늘의 맥주/이성준/오운/18000/979-11-92814-04-9",
				"food/버번 위스키의 모든 것/조승원/(주)교유당/24000/979-11-90277-42-6"
		};
		
		Biz biz = new Biz();
		
		List<Book> bookList = biz.convert(contents);
		
		BookStore bs = new BookStore(bookList);
		
		System.out.println("======PrintBookStore()=======");
		bs.printBookStore();
		
		System.out.println("\n======printBooksByCategory()=======");
		String category = "travel";
		bs.printBooksByCategory(category);
		
		
		System.out.println("\n=====printBoooksByIsbn()=======");
		String isbn = "979-11-90277-42-6";
		bs.printBoooksByIsbn(isbn);
		
		System.out.println("\n======printBooksByMaxPrice()=======");
		int maxPrice = 10000;
		bs.printBooksByMaxPrice(maxPrice);
		
		System.out.println("\n======printBooksByMinPrice()=======");
		int minPrice = 15000;
		bs.printBooksByMinPrice(minPrice);
		
		System.out.println("\n======printBooksByBetweenPrice()=======");
		int bMinP = 5000;
		int bMaxP = 20000;
		bs.printBooksByBetweenPrice(bMinP, bMaxP);
		
		
//		ArrayList<Book>	menuList = new ArrayList<Book>();
//		
//		
//		menuList.add(new Coffee("아메리카노", 3000, "에티오피아"));
//		menuList.add(new Coffee("카푸치노", 3500, "케냐"));
//		menuList.add(new Ade("레몬에이드", 4000, "레몬, 시럽"));
//		menuList.add(new Ade("한라봉에이드", 4000, "한라봉, 시럽"));
//		
//		for(Book m : menuList) {
//			m.printInfo();
//		}
//		
//		System.out.println("\n=========================\n");
//		
//		Map<String, Book> mMap = new HashMap<>();
//		
//		mMap.put("a", new Coffee("아메리카노", 3000, "에티오피아"));
//		mMap.put("b", new Coffee("카푸치노", 3500, "케냐"));
//		mMap.put("c", new Ade("레몬에이드", 4000, "레몬, 시럽"));
//		mMap.put("d", new Ade("한라봉에이드", 4000, "한라봉, 시럽"));
//		
//		Set<Entry<String, Book>> entrySet = mMap.entrySet();
//		
//		for(Entry<String, Book> e : mMap.entrySet()) {
//			e.getValue().printInfo();
//		}
//		
//		System.out.println("\n=========================\n");
//		
//		Iterator<Entry<String, Book>> i = mMap.entrySet().iterator();
//		
//		while(i.hasNext()) {
//			i.next().getValue().printInfo();
//		}
//		
//		System.out.println("\n=========================\n");
//		
/*
		Menu m = new Menu("녹차", 3000);
		m.printInfo();
		
		Coffee c = new Coffee("커피", 4000, "에티오피아");
		c.printInfo();
		
		Ade a = new Ade("레몬에이드", 5000, "레몬, 시럽");
		a.printInfo();
		
		System.out.println();
		System.out.println("============새로운거===========");
		System.out.println();
		
		Menu[] mArray = new Menu[3];
		mArray[0] = MenuService.MakeCoffee("아메", 3000, "에티오피아");
		mArray[1] = MenuService.MakeCoffee("카푸치노", 3500, "케냐");
		mArray[2] = MenuService.MakeAde("레몬에이드", 4000, "레몬, 시럽");
		
		for(int i=0; i<mArray.length; i++) {
			System.out.printf("%d.",i+1);
			mArray[i].printInfo();
		}
		*/

	}

}
