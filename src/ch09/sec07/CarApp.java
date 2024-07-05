package ch09.sec07;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단순 Car 생성자 호출결과");
		Car car = new Car();
		
		System.out.println("단순 Car의 run1 실행결과");
		car.run1();
		System.out.println("단순 Car의 run2 실행결과");
		car.run2();
		System.out.println("단순 Car의 run3 실행결과");
		car.run3(new Tire() {
			void roll() {
				System.out.println("그런데 매개변수로 전달하는 타이어의 상태가 메롱하게 익명 자식클래스여");
			}
		});
		
		System.out.println("단순 Tire 생성자 호출 결과");
		Tire t = new Tire();
		
		System.out.println("단순 Car의 run3 실행결과 //매개변수도 그냥 단순 Tire 객체 넣었어//");
		car.run3(t);
		
	}

}
