package ch06.fin.hw;

public class Actor {
	String name;
	String sex;
	String birthdate;
	String nationality;
	
	public Actor(String name, String sex, String birthdate, String nationality) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.nationality = nationality;
	}
	Actor(){
		this(" ", " "," ", " ");
	}
	
	void printInfo(){
		
		System.out.printf("이름: %s | ", name);
		System.out.printf("성별: %s | ", sex);
		System.out.printf("생년월일: %s | ", birthdate);
		System.out.printf("국적: %s", nationality);
		System.out.println();
	}
	
}
