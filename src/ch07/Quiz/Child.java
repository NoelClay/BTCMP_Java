package ch07.Quiz;

public class Child extends Parent{
	String name;
	
	public Child() {

		this("홍길동");
		
		System.out.println("Child() Call");


	}
	public Child(String s) {
		name = s;
		System.out.println("Child(String) Call");
	}
}
