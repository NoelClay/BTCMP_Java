package ch04.quiz;

public class ex04 {
	public static void main(String[] args) {
		while(true) {
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;
			if(x+y == 5) {
				System.out.printf("주사위 조합은 %d, %d 합은 %d 이라서 종료 끝\n", x, y, x+y );
				break;
			}
			else
				System.out.printf("주사위 조합은 %d, %d 합은 %d\n", x, y, x+y );			
		}
	}
}
