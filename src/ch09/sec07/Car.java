package ch09.sec07;

public class Car {
	Tire tire1 = new Tire();
	
	Tire tire2 = new Tire() {
		void roll(){
			System.out.println("Car 내부에 익명클래스 tire2의 Roll이 호출되면 출력될거야");
		}
	};
	
	void run1() {
		System.out.println("Car 내부에 T1.roll()과 T2.Roll() 둘다 실행하는 녀석");
		tire1.roll();
		tire2.roll();
	}
	
	void run2() {
		System.out.println("Run2에서는 새로 익명 자식 클래스를 생성해.");
		Tire tire = new Tire() {
			void roll() {
				System.out.println("run2의 익명 자식 클래스의 roll이 호출되면 출력되겠지.");
			}
		};
		tire.roll();
	}
	
	void run3(Tire tire) {
		tire.roll();
	}

}
