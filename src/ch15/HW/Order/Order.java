package ch15.HW.Order;

import java.text.*;
import java.util.*;

import ch06.fin.hw2.*;

public class Order {
	public static int number;
	public static int totalNumber;
	public static int totalBill;
	public List<Menu> mlist;
	public int sumPrice;
	public String orderTime;
	
	public Order(List<Menu> menuList1) {
		// TODO Auto-generated constructor stub

		mlist=menuList1;
		number++;
		totalNumber += menuList1.size();
		sumPrice = 0;
		for(Menu m : menuList1) {
			totalBill += m.getPrice();
		}
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss");
		orderTime =sdf.format(now);
	}

	void printOrder() {
		System.out.println("\n==========주문서========");
		System.out.println("*주문번호:"+number);
		
		for(int i=0; i<mlist.size(); i++) {
			System.out.printf("\t%d.", i+1);
			mlist.get(i).printInfo();
			sumPrice += mlist.get(i).getPrice();
		}
		System.out.println("*주문 메뉴수:"+mlist.size());
		
		System.out.println("*주문액:"+DecimalUtil.decimalComma(sumPrice)+"(원)");
		System.out.println("*주문시간:"+orderTime);
	}

	public static void printSummary() {
		// TODO Auto-generated method stub
		System.out.println("\n==========정산========");
		System.out.println("총 주문건수 : "+number);
		System.out.println("총 주문메뉴건수 : "+totalNumber);
		System.out.println("총 매출 : "+DecimalUtil.decimalComma(totalBill) + "(원)");
		
		
	}
}
