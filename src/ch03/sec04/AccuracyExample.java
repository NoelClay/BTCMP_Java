package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple =1;
		int pieces = 10;
		int numbersHuman =7;
		
		System.out.printf("[실수연산을 할경우] 사람수: %d 사과 한 조각의 양: %f 나눠주고 남은양: %f", numbersHuman, apple/(float)pieces, apple - (apple/(float)pieces*numbersHuman));
	}
}
