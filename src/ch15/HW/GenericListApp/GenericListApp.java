package ch15.HW.GenericListApp;

import java.util.*;

public class GenericListApp {

	public static void main(String[] args) {

		System.out.println("===== List =====");
		List list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		for (int i = 0; i < list1.size(); i++) {
			
			// 코딩
			Object obj=list1.get(i);
			Integer intObj = (Integer)obj;
			System.out.println("list[" + i + "]=" + intObj);
		}

		System.out.println("\n===== 제네릭(Generic) =====");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(50);
		list2.add(60);

		for (int i = 0; i < list2.size(); i++) {
			
			// 코딩
			int intObj = list2.get(i);
			
			System.out.println("list[" + i + "]=" + intObj);
		}

	}

}
