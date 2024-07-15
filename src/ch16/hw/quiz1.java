package ch16.hw;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== Anonymous =====");
		ISayable sayable = new ISayable() { // 익명 객체
		    @Override
		    public void sayHello() {
		        System.out.println("Hello");
		    }
		};
		sayable.sayHello();

		System.out.println("\n===== Lambda =====");

		System.out.println("----- Type 1. -----");
		// 실행문 1개
		ISayable sayable1 = () ->{
			System.out.println("Hello");
		};

		sayable1.sayHello();

		System.out.println("\n----- Type 2. -----");
		// 실행문 1개. 중괄호 삭제
		ISayable sayable2 = () -> System.out.println("Hello");

		sayable2.sayHello();

		System.out.println("\n----- Type 3. -----");
		// 실행문 2개
		ISayable sayable3 = ()-> {
			System.out.println("Hello");
			System.out.println("Welcome");
		};

		sayable3.sayHello();

	}

}
