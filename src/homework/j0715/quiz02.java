package homework.j0715;

import java.util.Scanner;

import ch18.hw1.WriteObjectFileApp.Person;

public class quiz02 {

	public static void main(String[] args) {
		
		System.out.println("==== start====");
		// TODO Auto-generated method stub
		String a;
		String regExp = "^[가~힣]*$";
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("이름 입력 =>");
			try {

				a = s.nextLine();
				if(a.matches(regExp))
					break;
				else
					throw new Exception();
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
		Person p = new Person(a, b);
		System.out.println("이름="+ p.name() + " | " + "나이="+p.age());
		System.out.println("==== end====");

	}

}
