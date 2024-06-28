package ch06.fin.hw;

public class CarApp {                                                                       
	public static void main(String[] args) {                                                   
		System.out.println("===== Company Info =====");  
		String name = "Hyundai";                         
		String biz = "자동차";                        
		Company company = new Company (name, biz);
		company.printInfo();
		System.out.println("\n===== Car Info =====");
		String model = "Santafe";
		String color = "White";
		String type = "SUV";

		Car car = new Car(model, color, type, company);

		car.printInfo();
	}
}

