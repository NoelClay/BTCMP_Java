package ch06.Homework;

public class User {
	public User() {this(" ", 0, 'M', 1.0f, true);}
	public User(String string, int i, char c) {
		// TODO Auto-generated constructor stub
		this(string, i, c, 1.0f, true);
	}
	public User(String string, int i, char c, float f, boolean b) {
		// TODO Auto-generated constructor stub
		name = string;
		age = i;
		height = f;
		sex = c;
		marriageYn = b;
	}
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	/**
	 * @return the marriageYn
	 */
	public boolean isMarriageYn() {
		return marriageYn;
	}
	/**
	 * @param marriageYn the marriageYn to set
	 */
	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
	}
	
	public String PrintSex(char result) {		
		return result == 'M' ? "남자" : "여자";
	}
	
	String name;
	int age;
	float height;
	char sex;
	boolean marriageYn;
	
	void PrintInfo() {
		System.out.printf("이름: %s\n", getName());
		System.out.printf("나이: %d\n", getAge());
		System.out.printf("키: %.1f\n", getHeight());
		System.out.printf("성별: %s\n", (getSex() == 'M' ? "남자":"여자"));
		System.out.printf("결혼여부: %s\n", isMarriageYn()? "기혼" : "미혼");
	}
}
