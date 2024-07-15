package homework.j0715;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		System.out.println("==== start====");
		// TODO Auto-generated method stub
		int a;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("첫번째 숫자 입력 =>");
			try {
				a = Integer.parseInt(s.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("다시 입력하시오.");
			}
		}
		
		int b;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("두번째 숫자 입력 =>");
			try {
				b = Integer.parseInt(s.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("다시 입력하시오.");
			}
		}
		int result = a+b;
		System.out.println(a + " + " + b + " = " + result);
		System.out.println("==== end====");

	}

}
