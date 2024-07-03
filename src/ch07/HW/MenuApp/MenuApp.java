package ch07.HW.MenuApp;

public class MenuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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

	}

}
