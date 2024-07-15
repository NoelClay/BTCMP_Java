package ch16.sec02;

import java.util.function.*;

public class Person {

	public String name;
	public int age;
	
	public Person(String string, int i) {
		// TODO Auto-generated constructor stub
		name = string;
		age = i;
	}

	public Person() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void actionC(Calculable c) {
		double result = c.calculate(10.0, 4.0);
		System.out.println(result);
	}
	
	public void actionW(Workable w) {
		w.work("사람", "직업");
	}
	
	public void actionS(Speachable s) {
		s.speach("안녕하세요");
	}
	
	public Member getMember1(Creatable1 c) {
		String id = "Winter";
		Member m = c.create(id);
		return m;
	}
	
	public Member getMember2(Creatable2 c) {
		String id = "Summer";
		String name = "여름";
		Member m = c.create(id, name);
		return m;
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름="+name+"|나이="+age);
	}

	public void test(ToIntFunction<Person> t) {
		t.applyAsInt(this);
	}
}
