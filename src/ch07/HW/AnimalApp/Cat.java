package ch07.HW.AnimalApp;

public class Cat extends Animal{
	
	int feet;

	Cat(String name, int age, String sex, int feet) {
		super("고양이", name, age, sex);
		this.feet = feet;
		// TODO Auto-generated constructor stub
	}

	void customFunction() {
		super.customFunction();
		System.out.printf(" | 다리=%d", feet);		
	}
	
	void sleep() {
		System.out.printf("sleep() :: %s", name);		
		System.out.println();
	}
}
