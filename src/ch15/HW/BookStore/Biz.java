package ch15.HW.BookStore;

import java.util.*;

public class Biz {
	public static int number;
	public static int totalNumber;
	public static int totalBill;
	public List<Book> mlist;
	public int sumPrice;
	public String orderTime;
	
	public Biz(List<Book> menuList1) {
		// TODO Auto-generated constructor stub

//		mlist=menuList1;
//		number++;
//		totalNumber += menuList1.size();
//		sumPrice = 0;
//		for(Book m : menuList1) {
//			totalBill += m.getPrice();
//		}
//		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss");
//		orderTime =sdf.format(now);
	}

	public Biz() { 
		// TODO Auto-generated constructor stub
	}

//	void printOrder() {
//		System.out.println("\n==========주문서========");
//		System.out.println("*주문번호:"+number);
//		
//		for(int i=0; i<mlist.size(); i++) {
//			System.out.printf("\t%d.", i+1);
//			mlist.get(i).printInfo();
//			sumPrice += mlist.get(i).getPrice();
//		}
//		System.out.println("*주문 메뉴수:"+mlist.size());
//		
//		System.out.println("*주문액:"+DecimalUtil.decimalComma(sumPrice)+"(원)");
//		System.out.println("*주문시간:"+orderTime);
//	}
//
//	public static void printSummary() {
//		// TODO Auto-generated method stub
//		System.out.println("\n==========정산========");
//		System.out.println("총 주문건수 : "+number);
//		System.out.println("총 주문메뉴건수 : "+totalNumber);
//		System.out.println("총 매출 : "+DecimalUtil.decimalComma(totalBill) + "(원)");
//		
//		
//	}
	
	public List<Book> convert(String[] s){
		List<Book> result = new ArrayList<Book>();
		List<String> ss;
		for(int i=0; i<s.length; i++) {
			StringTokenizer st = new StringTokenizer(s[i], "/");
//			while(st.hasMoreTokens()) {
//				ss.add(st.nextToken());
//			}
			result.add(new Book(st));
		}
		return result;
	}
}
