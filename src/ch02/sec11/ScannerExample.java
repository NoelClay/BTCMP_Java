package ch02.sec11;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//무한반복 하면서 스캐너로 입력받은거 출력하는 함수 만들고, q를 받으면 종료되게 해라.
		
		play();
//		System.out.println(System.exit(0));
		System.exit(0);
	}

	private static void play() {
		// TODO Auto-generated method stub
		System.out.println("==== q 누르면 종료되요.");
		while(true)
		{
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			
			if(input.equals("q")) break;
			System.out.println(input);
		}
	}

}
