package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'A'+1:
		case 'a'+1:
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		switch(grade) {
		case 'A','a'->{
			System.out.println("!우수회원입니다.");
		}
		case 'A'+1,'a'+1->{
			System.out.println("!일반회원입니다.");
		}
		default->{
			System.out.println("!손님입니다.");
		}
		}
	}

}
