package ch02.sec02;

public class LiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1=0b1011;
		int val2=0206;
		int val3=365;
		int val4=0xB3;
		//byte val5 = 128;  범위 초과 에러
		//long val5 = 10000000000; //literal out of range  리터럴 데이터 타입이 잘못
		long val6 = 1000000000l;
		
		/*
		 * try { byte val5 = 128; } catch (NullPointerException e) {
		 * 
		 * }
		 */
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val6);
	}

}
