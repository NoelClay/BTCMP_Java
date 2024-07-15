package ch04.sec05;

import java.util.Scanner;

public class keyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//현재 속도는 0, 최대 속도 = 3 최소 속도 = 0
		//분기 1: 가속 2: 감속 3: 종료
		int nowSpd = 0;
		final int max = 3;
		final int min = 0;
		boolean b = true;
		
		while(b) {
			System.out.println("분기 1: 가속 2: 감속 3: 종료");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			System.out.println("당신의 선택:" + input);
			
			switch(input){
			case "1" -> nowSpd++;
			case "2" -> nowSpd--;
			case "3" -> b = false;
			default -> 	System.out.println("1, 2, 3 중에서만 입력하시오");
			}
			
			if(nowSpd > max) {
				System.out.println("최대 속력 입니다.");
				nowSpd = max;
			}
			else if(nowSpd < min) {
				System.out.println("최저 속력 입니다.");
				nowSpd = min;
			}
			System.out.println("속도:" + nowSpd);
		} 
		System.out.println("프로그램 종료");

	}

}
