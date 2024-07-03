package ch07.HW.PersonApp2;

public class Teacher extends Person {

	private String lesson;

	public Teacher() {
		setOriginPerson(false);
	}

	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
		setOriginPerson(false);
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println(" | 과목="+getLesson());
	}
}
