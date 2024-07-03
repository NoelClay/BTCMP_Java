package ch07.HW.AnimalApp;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Animal a = new Animal("동물", "콩이", 1, "F");
		a.printInfo();
			

		System.out.println();
		Cat c = new Cat("양이", 5, "F", 3);
		c.printInfo();
		c.sleep();
		
		System.out.println();
		Eagle e = new Eagle("나비", 4, "M", 2);
		e.printInfo();
		e.fly();

	}

}
