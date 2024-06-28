package ch06.Homework;

public class Calculator2 {
	int a, b, result;
	public Calculator2(int x, int y) {
		a = x;
		b=y;
	}
	
	public void plus() {
		System.out.printf("Plus() :: %d + %d = %d\n", a, b, a+b);
	}
	public void minus() {
		System.out.printf("Minus() :: %d - %d = %d\n", a, b, a-b);
	}
	public void multiply() {
		System.out.printf("Multiply() :: %d * %d = %d\n", a, b, a*b);
	}
	public void divide() {
		System.out.printf("divide() :: %d / %d = %d\n", a, b, a/b);
	}
	public void rest() {
		System.out.printf("rest() :: %d %% %d = %d\n", a, b, a%b);
	}
	public void printInfo() {
		System.out.printf("값1 = %d, 값2 = %d\n", a, b);
	}
	public void clear() {
		System.out.println("필드 초기화 완료");
		a = 0;
		b = 0;
	}
}
