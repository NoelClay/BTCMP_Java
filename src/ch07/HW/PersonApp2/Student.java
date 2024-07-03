package ch07.HW.PersonApp2;

public class Student extends Person {

	private String hakbun;

	public Student() {
		setOriginPerson(false);
	}

	public Student(String name, int age, String hakbun) {
		super(name, age);
		this.hakbun = hakbun;
		setOriginPerson(false);
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println(" | 학번="+getHakbun());
	}
}