package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "941225-10000000";
		
		String firstNum = ssn.substring(0, 6);
		String lastNum = ssn.substring(7);
		
		System.out.print(firstNum + "\n" + lastNum);
	}

}
