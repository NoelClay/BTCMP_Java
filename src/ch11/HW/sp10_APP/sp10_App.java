package ch11.HW.sp10_APP;

import ch07.HW2.Inheritance_Person_Student_Teacher.*;

public class sp10_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\n===========1번=========\n");
		int a = 10;
		int b = 0;
		
		System.out.print("a="+a);
		System.out.println(" b="+b);
		
		try {
			int result = a/b;
			System.out.println("result=" +result);
		}
		catch(Exception e){
			System.out.println("===========catch=========");
		}
		finally {
			System.out.println("===========finally=========");

		}
		
		System.out.println("\n\n===========2번=========\n");
		
		System.out.println("===========Object 1=========");
		String string1 = "Hello";
		System.out.println(string1.charAt(1));
		
		try {
			System.out.println("===========Object 2=========");
			String string2 = "";
			System.out.println(string2.charAt(1));
		}
		catch(Exception e){
			System.out.println("===========catch=========");
		}
		finally {
			System.out.println("===========finally=========");

		}

		System.out.println("\n\n===========3번=========\n");
		
		try {
			Person p = null;
			String name = p.getName();
			System.out.println("이름 : "+ name);
		}
		catch(Exception e){
			System.out.println("===========catch=========");
		}
		finally {
			System.out.println("===========finally=========");

		}
		
		
		System.out.println("\n\n===========4번=========\n");
		
		try {
			System.out.println("===========Object 1=========");
			String string3 = "Hello";
			System.out.println(Integer.parseInt(string3));
			
			System.out.println("===========Object 2=========");
			String string4 = "";
			System.out.println(Integer.parseInt(string4));
		}
		catch(Exception e){
			System.out.println("===========catch=========");
		}
		finally {
			System.out.println("===========finally=========");

		}

	}

}
