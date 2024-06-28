package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		int result1=10+2+8; //20
		String result2 = 10 +2 +"8"; //"128"
		String result3 = 10 +"2" +8;//"1028"
		String result4 = "10" +2 +8;//"1028"
		String result5 = "10" +(2 +8);//"1010"

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
}
