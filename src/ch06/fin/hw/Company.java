package ch06.fin.hw;

public class Company {
	String name;
	String biz;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getBiz() {
		return biz;
	}
	void setBiz(String biz) {
		this.biz = biz;
	}
	
	Company(String name, String biz) {
		this.name = name;
		this.biz = biz;
	}
	void printInfo() {
		System.out.printf("회사명: %s\n", getName());
		System.out.printf("사업분야: %s\n", getBiz());

		System.out.println("-----------");
	}
}
