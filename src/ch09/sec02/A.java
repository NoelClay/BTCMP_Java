package ch09.sec02;

public class A {

	class B{
		
	}
	
	B b1 = new B();
	
	A(){
		System.out.println("A 생성자 호출");
		B b2 = new B();
		System.out.println("B 생성자도 호출");
	}
	
	void method() {
		B b2 = new B();
		System.out.println("B 생성자도 호출");
	}
}
