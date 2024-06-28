package ch06.Homework;

public class CalculatorApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 cal = new Calculator2(10, 6);
		
		
		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();
		
		System.out.println("\n======printInfo==========");
		cal.printInfo();
		System.out.println("\n======clear==========");
		cal.clear();
		System.out.println("\n======printInfo==========");
		cal.printInfo();
	}

}
