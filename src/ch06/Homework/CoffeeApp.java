package ch06.Homework;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("===== Object 1 =====");
        Coffee coffee1 = new Coffee();
        coffee1.setName("아메리카노");
        coffee1.setPrice(4000);
        coffee1.PrintInfo();

        System.out.println("\n===== Object 2 =====");
        Coffee coffee2 = new Coffee("카푸치노", 5000);
        coffee2.PrintInfo();
    }
}
