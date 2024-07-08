package ch15.HW.Order;

public class MenuApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Menu m = new Menu("녹차", 3000);
		m.printInfo();
		
		Coffee c = new Coffee("커피", 4000, "에티오피아");
		c.printInfo();
		
		Ade a = new Ade("레몬에이드", 5000, "레몬, 시럽");
		a.printInfo();
		


	}

}
