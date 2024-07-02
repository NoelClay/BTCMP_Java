package ch07.HW.No_Argument_App;

public class Teacher extends Person {

	private String lesson;

	public Teacher() {
		System.out.println("Teacher()");
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

}
