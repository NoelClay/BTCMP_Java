package ch06.Homework;

public class Message {
	void printInfo(String s) {
		System.out.println(s);
	}
	void printInfo(int s) {
		System.out.println(s);
	}
	void printInfo(String s, int i) {
		System.out.println(s +", "+ i);
	}
	void printInfo(int i, String s) {
		System.out.println(i + ", " + s);
	}
}
