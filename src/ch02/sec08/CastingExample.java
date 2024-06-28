package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =10;
		byte v2 = (byte)v1;
		System.out.println(v1 + " "+ v2);
		
		
		int v3 =65;
		char v4 =(char)v3;
		System.out.println(v3 + " "+ v4);
		
		long v5 =10000;
		int v6 = (int)v5;
		System.out.println(v5 + " "+ v6);
		
		double v7 = 3.14;
		int v8 = (int)v7;
		System.out.println(v7 + " "+ v8);
		
	}

}
