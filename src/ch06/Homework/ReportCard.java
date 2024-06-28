package ch06.Homework;

public class ReportCard {

	String name;
	int korean;
	int english;
	int math;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the korean
	 */
	public int getKorean() {
		return korean;
	}
	/**
	 * @param korean the korean to set
	 */
	public void setKorean(int korean) {
		this.korean = korean;
	}
	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}
	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}
	public ReportCard(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public ReportCard() {
		this(" ", 0, 0, 0);
	}
	public ReportCard(String name) {
		this(name, 0, 0, 0);
	}
	public int average() {
		return (korean+english+math)/3;
	}
	public int sum() {return (korean+english+math);}
	
	public char hakjum() {
		char result;
		switch(average()/10) {
		case 10, 9 -> result = 'A';
		case 8 -> result = 'B';
		default -> result = 'F';
		}
		return result;
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.printf("이름 = %s\n", name);
		System.out.printf("국어 = %d\n", korean);
		System.out.printf("영어 = %d\n", english);
		System.out.printf("수학 = %d\n", math);
		System.out.printf("합계 = %d\n", sum());
		System.out.printf("평균 = %d\n", average());
		System.out.printf("학점 = %c\n", hakjum());
	}
}
