package ch07.Quiz;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() Call");
	}
	public Parent(String s) {
		nation = s;
		System.out.println("Parent(String) Call");
	}
}
