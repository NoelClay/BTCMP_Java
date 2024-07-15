package ch16.sec02;

public class Member {

	String ID;
	String Name;
	
	public Member(String id) {
		ID = id;
		System.out.println("Member(String ID)");
	}
	
	public Member(String id, String n) {
		ID = id;
		Name = n;
		System.out.println("Member(String ID, String NAME)");
	}
	
	public String toString() {
		String s = " id: " + ID + " name: " + Name;
		return s;
	}
}
