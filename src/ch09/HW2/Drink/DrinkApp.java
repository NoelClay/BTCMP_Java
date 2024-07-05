package ch09.HW2.Drink;

public class DrinkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("======Variable========");
		System.out.println("======Implement Interface========");
		Drink beer = new Beer();
		beer.drink();

		Drink water = new Water();
		water.drink();
		
		System.out.println("\n======Anonymous Object========");
		Drink beer1 = new Beer() {
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("맥주를 마시다");

			}
		};
		beer1.drink();
		
		Drink water1 = new Beer() {
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("물을 마시다");

			}
		};
		water1.drink();
		
		System.out.println("======method========");
		System.out.println("======Implement Interface========");
		
		Biz b = new Biz();
		b.biz(beer);
		b.biz(water);
		
		System.out.println("\n======Anonymous Object========");
		b.biz(new Beer() {
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("와인을 마시다");

			}}); 
		
		b.biz(new Beer() {
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("커피를 마시다");

			}}); 
		
		
	}

}
