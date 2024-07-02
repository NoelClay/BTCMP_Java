package ch05.homework.Salary;

public class SalaryManager {
	Employee[] bookArray;

	Employee[] getBookArray() {
		return bookArray;
	}

	void setBookArray(Employee[] bookArray) {
		this.bookArray = bookArray;
	}

	SalaryManager(Employee[] bookArray) {
		this.bookArray = bookArray;
	}
	
	public void printInfo() {
		System.out.println("----------------------");
		System.out.println("사번 | 이름 | 연봉 | 사원평가 | 등급 | 내년연봉");
		System.out.println("--------------------------------");
		for(int i = 0; i<bookArray.length; i++) {
			
			bookArray[i].printInfo();
			System.out.println();
		}
		
	}
	
}

