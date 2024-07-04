package ch08.HW.FlyApp;

public class Human extends Animal {
	public Human(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	public Human(int age, String name) {
		super(age);
		this.name = name;
		// TODO Auto-generated constructor stub
	}


	String name;
	public void printInfo() {
		System.out.println("나이"+age +" : 이름="+name);
	}
	public void eat(){
		System.out.println(this.getClass().getSimpleName() + ".eat()");
	}

}
