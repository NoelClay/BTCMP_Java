package ch07.HW.PersonApp2;

public class Person {

	private String name;
	private int age;
	private boolean originPerson =true;

	public boolean isOriginPerson() {
		return originPerson;
	}

	public void setOriginPerson(boolean originPerson) {
		this.originPerson = originPerson;
	}

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("====" + this.getClass().getSimpleName()+ "=============");
		System.out.printf("이름=" + getName() + " | 나이="+getAge());
		if(isOriginPerson())	System.out.println();
	}


}