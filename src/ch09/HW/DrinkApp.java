package ch09.HW;

public class DrinkApp {

	public static void main(String[] args) {

		System.out.println("===== 외부 클래스 =====");
		Drink1 drink = new Drink1("물");
		drink.printInfo();

		System.out.println("\n===== 중첩 클래스 =====");
		Drink1.Coffee coffee = drink.new Coffee("아메리카노");

		coffee.printCoffeInfo();
		coffee.printCoffeeAllnfo();

	}

}
