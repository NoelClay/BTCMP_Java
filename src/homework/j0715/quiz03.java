package homework.j0715;

import java.util.Scanner;
import java.util.regex.Pattern;


import ch18.hw1.WriteObjectFileApp.Person;

public class quiz03 {

	public static void main(String[] args) {
		
		System.out.println("==== start====");
		// TODO Auto-generated method stub

		while(true) {

			int a;
			System.out.println("\n==== 메뉴선택====\n 2.등록 \n 9.종료");
			Scanner s = new Scanner(System.in);
			System.out.print("메뉴를 선택하세요 =>");

				try {
					a = Integer.parseInt(s.nextLine());
					if(a==9) {
						System.out.println("종료합니다.");
						break;
					}
					else if(a==2) {
						play();
					}
					else {
						throw new Exception("그런 메뉴는 없어요 다시 입력하세요");
					}
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		System.out.println("==== end====");

	}

	private static void play() {
		// TODO Auto-generated method stub
		String a;
		String regExp = "^[가-힣a-zA-Z]*$";
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("이름 입력 =>");
			try {

				a = s.nextLine();
				if(Pattern.matches(regExp, a))
					break;
				else
					throw new Exception("한글과 영어만 사용하세요. 이름 다시 입력하세요");
			}catch(Exception e) {
				System.out.println(e.toString());
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
				System.out.println("숫자 입력한거 맞아요?");
			}
		}
		Person p = new Person(a, b);
		System.out.println("이름="+ p.name() + " | " + "나이="+p.age());
		System.out.println("==== 계속진행합니다====");

	}

}
