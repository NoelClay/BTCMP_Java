package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] agrs) {
		int num1 = 10, num2 = 10, num3 =1;
		char char1 = 'A', char2 = 'B';
		double num4 = 1.0, num6=0.1;
		float num5 = 0.1f;
		String str1 = "자바", str2 = "java";
		boolean result1 = num1 == num2; //true  // 정수형 간의 비교 연산은 int로 자동형변환되어 수행되고
		boolean result2 = num1 != num2; //false
		boolean result3 = num1 <= num2; //true
		boolean result4 = char1 < char2; //true
		boolean result5 = num3 == num4; //false -> true //정수와 실수형 연산에서는 실수형으로 자동형변환
		boolean result6 = num5 ==num6; //false
		boolean result7 = num5 == (float)num6; //true
		boolean result8 = (str1.equals(str2)); //false
		boolean result9 = (!str1.equals(str2)); //false -> true // !not 연산자의 우선순위는 맨나중이다.
	}
}
