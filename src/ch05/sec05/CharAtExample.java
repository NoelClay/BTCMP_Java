package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn= "94122510000000";
		char sex = ssn.charAt(6);
		
		switch(sex) {
		case '1', '3' -> System.out.println("남자요");
		case '2', '4' -> System.out.println("여자요");
		default -> System.out.println("몰라요");
		}
	}

}
