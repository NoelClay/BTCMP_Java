package ch06.quiz;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class MemberService{
		String id = "hong";
		String password = "12345";
		
		boolean login(String id, String pw) {
			if(this.id == id && this.password == pw) {
				return true;
			}
			else return false;
		}
		
		void logout(String id) {
			if(this.id == id) {
				System.out.println(id + "님이 로그아웃 되었습니다.");
			}
		}
	}
}
