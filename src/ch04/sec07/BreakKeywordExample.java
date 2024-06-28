package ch04.sec07;

public class BreakKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char upper = 'A'; upper<='Z';upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.printf("대문자: %c 소문자: %c\n", upper, lower);
			}
		}
	}

}
