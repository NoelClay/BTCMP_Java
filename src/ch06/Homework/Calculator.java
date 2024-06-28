package ch06.Homework;

public class Calculator {
	public static void plus(int a, int b) {
		System.out.printf("Plus() :: %d + %d = %d\n", a, b, a+b);
	}
	public static void minus(int a, int b) {
		System.out.printf("Minus() :: %d - %d = %d\n", a, b, a-b);
	}
	public static void multiply(int a, int b) {
		System.out.printf("Multiply() :: %d * %d = %d\n", a, b, a*b);
	}
	public static void divide(int a, int b) {
		System.out.printf("divide() :: %d / %d = %d\n", a, b, a/b);
	}
	public static void rest(int a, int b) {
		System.out.printf("rest() :: %d %% %d = %d\n", a, b, a%b);
	}
}
