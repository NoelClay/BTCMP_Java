package ch07.HW.AnimalApp;

public class Animal {
	String spec = "동물";
	String name;
	int age;
	String sex;
	
	
	Animal(String spec, String name, int age, String sex) {
		this.spec = spec;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	String getKorSex(String s) {
		String result;
		switch(s) {
		case "F" -> result = "여";
		default -> result = "남";
		}
		return result;
	}
	
	void printInfo() {
		System.out.printf("======%s=====", this.getClass().getSimpleName());
		System.out.println();
		System.out.printf("동물=%s | 이름=%s | 나이=%d | 성별=%s", spec, name, age, getKorSex(sex) );
		//System.out.println(this.getClass().getSimpleName());
		customFunction();
		System.out.println();
	}
	void customFunction() {
		
	}
}
