package ch09.TEST;

public class Outer {
	
	
	public Outer() {
		System.out.println("아우터가 생성되었어");
	}

	public class Inner{

		public Inner() {
			System.out.println("이너가 생성되었어");
		}
		public static void print() {
			System.out.println("이너 내부 함수 호출");
		}
		
	}
}
