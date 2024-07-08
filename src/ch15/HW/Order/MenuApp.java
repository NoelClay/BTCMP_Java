package ch15.HW.Order;

import java.util.*;
import java.util.Map.*;

public class MenuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Menu>	menuList = new ArrayList<Menu>();
		
		
		menuList.add(new Coffee("아메리카노", 3000, "에티오피아"));
		menuList.add(new Coffee("카푸치노", 3500, "케냐"));
		menuList.add(new Ade("레몬에이드", 4000, "레몬, 시럽"));
		menuList.add(new Ade("한라봉에이드", 4000, "한라봉, 시럽"));
		
		for(Menu m : menuList) {
			m.printInfo();
		}
		
		System.out.println("\n=========================\n");
		
		Map<String, Menu> mMap = new HashMap<>();
		
		mMap.put("a", new Coffee("아메리카노", 3000, "에티오피아"));
		mMap.put("b", new Coffee("카푸치노", 3500, "케냐"));
		mMap.put("c", new Ade("레몬에이드", 4000, "레몬, 시럽"));
		mMap.put("d", new Ade("한라봉에이드", 4000, "한라봉, 시럽"));
		
		Set<Entry<String, Menu>> entrySet = mMap.entrySet();
		
		for(Entry<String, Menu> e : mMap.entrySet()) {
			e.getValue().printInfo();
		}
		
		System.out.println("\n=========================\n");
		
		Iterator<Entry<String, Menu>> i = mMap.entrySet().iterator();
		
		while(i.hasNext()) {
			i.next().getValue().printInfo();
		}
		
		System.out.println("\n=========================\n");
		
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
