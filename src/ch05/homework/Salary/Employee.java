package ch05.homework.Salary;

public class Employee {
	
	String stringPersonNumber;
	String stringName;
	int intPay;
	int intScore;
	char charGrade;
	int intNextPay;
	
	
	
	String getStringPersonNumber() {
		return stringPersonNumber;
	}



	void setStringPersonNumber(String stringPersonNumber) {
		this.stringPersonNumber = stringPersonNumber;
	}



	String getStringName() {
		return stringName;
	}



	void setStringName(String stringName) {
		this.stringName = stringName;
	}



	int getIntPay() {
		return intPay;
	}



	void setIntPay(int intPay) {
		this.intPay = intPay;
	}



	int getIntScore() {
		return intScore;
	}



	void setIntScore(int intScore) {
		this.intScore = intScore;
	}


	Employee(String stringPersonNumber, String stringName, int intPay, int intScore) {
		super();
		this.stringPersonNumber = stringPersonNumber;
		this.stringName = stringName;
		this.intPay = intPay;
		this.intScore = intScore;
		this.charGrade = getGrade(intScore);
		this.intNextPay = calPay(intPay, getGrade(intScore));
	}

	char getGrade(int score) {
		if(score >= 95) return 'S';
		if(score >= 90) return 'A';
		if(score >= 80) return 'B';
		if(score >= 70) return 'C';
		else	return 'D';			
	}

	int calPay(int curPay, char grade) {
		
		double d;
		switch(grade) {
		case 'S' -> d = 1.15;
		case 'A' -> d = 1.10;
		case 'B' -> d = 1.05;
		case 'C' -> d = 1.03;
		default -> d = 1.0;
		
		}
		return (int)(d*curPay);
	}
	
	void printInfo() {
		System.out.printf("%s | %s | %d | %d | %c | %d", getStringPersonNumber(), getStringName(), getIntPay(), getIntScore(), this.charGrade, this.intNextPay );
	}
	
	
	
}
