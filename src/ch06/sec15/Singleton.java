package ch06.sec15;

public class Singleton {

	/*
	 * 1. 외부에서 생성을 막는다 -> private 생성자
	 * 2. 인스턴스는 단 한개만 존재해야한다. -> 프로그램이 끝날때까지 사라지지 않음 -> 클래스 내부에서 static 인스턴스 생성
	 * 3. 외부에서 접근을 할수있는 통로를 제공한다. -> getInstance라는 함수를 제공 -> public으로 제공해야함. 스태틱일 필요는 전혀 없음
	 * 왜냐하면 이미 인스턴스가 스태틱에 존재하니까
	
	*/
	
	private Singleton() {
		
	}
	public Singleton getInstance() {
		return instance;
	}
	private static Singleton instance = new Singleton();
}
