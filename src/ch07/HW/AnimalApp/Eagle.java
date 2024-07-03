package ch07.HW.AnimalApp;

public class Eagle extends Animal{

	int feet;

	Eagle(String name, int age, String sex, int feet) {
		super("독수리", name, age, sex);
		this.feet = feet;
		// TODO Auto-generated constructor stub
	}

	void customFunction() {
		super.customFunction();
		System.out.printf(" | 다리=%d", feet);		
	}
	
	void fly() {
		System.out.printf("fly() :: %s", name);		
		System.out.println();
	}
}
