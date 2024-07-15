package ch16.hw;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== Anonymous =====");
		System.out.println("----- Type 1. -----");
		// 실행문 1개
		IDrawable drawable1 = new IDrawable() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("동그라미");
			}
			
		};

		drawable1.draw();

		System.out.println("\n----- Type 2. -----");
		// 실행문 2개
		IDrawable drawable2 = new IDrawable() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("삼각형");
				System.out.println("사각형");
				
			}
			
		};

		drawable2.draw();

		System.out.println("\n===== Lambda =====");
		System.out.println("----- Type 1. -----");
		// 실행문 1개
		IDrawable drawable3 = () -> System.out.println("동그라미");

		drawable3.draw();

		System.out.println("\n----- Type 2. -----");
		// 실행문 2개
		IDrawable drawable4 = () ->{
			System.out.println("삼각형");
			System.out.println("사각형");
		};

		drawable4.draw();

	}

}
