package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println(value1+ "\n"  + value2 + "\n" + value3);
		
		System.out.println(String.valueOf(value1));
		System.out.println(String.valueOf(value2));
		System.out.println(String.valueOf(value3));
	}

}
