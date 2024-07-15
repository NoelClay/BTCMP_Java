package ch18.hw1.WriteObjectFileApp;

import java.io.Serializable;

public record Person(String name, int age) implements Serializable{

	public String printInfo() {
		return "이름="+ name + "|나이=" +age;
	}
}
