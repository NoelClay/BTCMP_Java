package ch06.Homework;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		int val1 =10, val2 =6;
		
		cal.plus(val1, val2);
		cal.minus(val1, val2);
		cal.multiply(val1, val2);
		cal.divide(val1, val2);
		cal.rest(val1, val2);
		
		Calculator.plus(val1, val2);
		Calculator.minus(val1, val2);
		Calculator.multiply(val1, val2);
		Calculator.divide(val1, val2);
		Calculator.rest(val1, val2);
		
	}

}
