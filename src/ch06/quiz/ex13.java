package ch06.quiz;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Member{
		String name;
		String id;
		String password;
		int age;
		
		public Member(String name, String id, String password, int age) {
			this.name = name;
			this.id = id;
			this.password = password;
			this.age = age;
		}

		Member(String name, String id){
			this(name, id, " ", 0);
		}
	}

}
