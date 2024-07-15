package homework.j0715;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Manager {

	public static List<Person> personlist = new ArrayList<Person>();
	public int min = 0;
	public int max = 0;
	
	public void printPersonList() {
		// TODO Auto-generated method stub
		if(personlist.isEmpty())
			System.out.println("등록된 Person정보가 없습니다.");
		else {
			for(int i = 0; i< personlist.size(); i++) {
				System.out.println(personlist.size());
				System.out.println(i+1 + ". " + personlist.get(i));
			}
		}
	}

	public void addPerson(Scanner sc) {
		// TODO Auto-generated method stub
		
		personlist.add(useSC(sc));
	}

	public void updatePerson(Scanner sc) {
		// TODO Auto-generated method stub
		Person p = useSC(sc);
		for(int i=0; i< personlist.size(); i++) {
			System.out.println("디버깅: " + p);
			if(personlist.get(i).id().equals(p.id())) {
				System.out.println("true");
				personlist.set(i, p);
			}
		}
	}

	public void deletePerson(Scanner sc) {
		// TODO Auto-generated method stub
		String s = deleteID();
		for(int i=0; i< personlist.size(); i++) {
			if(personlist.get(i).id().equals(s)) {
				personlist.remove(i);
				break;
			}
		}
	}

	public void selectPersonBySex(Scanner sc) {
		// TODO Auto-generated method stub
		char d = getSex();
		for(int i=0; i< personlist.size(); i++) {
			if(personlist.get(i).sex() == d) {
				System.out.println(personlist.get(i));
			}
		}
		
	}

	public void selectPersonBetweenAge(Scanner sc) {
		// TODO Auto-generated method stub
		betweenAge();
		if(min > max) System.out.println("시작나이는 종료나이보다 작아야 합니다.");
		else {
			personlist.stream().filter(x -> x.age()>=min &&x.age()<=max).forEach(x -> System.out.println(x));
		}
	}
	
	public Person useSC(Scanner sc) {
		String a;
		String regExp = "^[가-힣a-zA-Z]*$";
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("ID를 입력하세요 =>");
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
		
		String b;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("이름을 입력하세요 =>");
			try {

				b = s.nextLine();
				if(Pattern.matches(regExp, b))
					break;
				else
					throw new Exception("한글과 영어만 사용하세요. 이름 다시 입력하세요");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		
		int c;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("나이를 입력하세요 =>");
			try {
				c = Integer.parseInt(s.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자 입력한거 맞아요?");
			}
		}
		
		char d;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("성별을 입력하세요 값: F or M =>");
			try {
				d = s.nextLine().charAt(0);

				if(d == 'F' || d=='M')
					break;
				else
					throw new Exception();
			}catch(Exception e) {
				System.out.println("F랑 M 둘중에 하나 입력하세요.");
			}
		}
		
		Person p = new Person(a, b, c, d);
		return p;
	}
	public String deleteID() {
		String a;
		String regExp = "^[가-힣a-zA-Z]*$";
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("ID를 입력하세요 =>");
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
		return a;
	}
	public char getSex() {
		char d;
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("성별을 입력하세요 값: F or M =>");
			try {
				d = s.nextLine().charAt(0);

				if(d == 'F' || d=='M')
					break;
				else
					throw new Exception();
			}catch(Exception e) {
				System.out.println("F랑 M 둘중에 하나 입력하세요.");
			}
		}
		return d;
	}
	
	public void betweenAge() {
		
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("시작나이를 입력하세요 =>");
			try {
				min = Integer.parseInt(s.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자 입력한거 맞아요?");
			}
		}
		
		while(true) {

			Scanner s = new Scanner(System.in);
			System.out.print("종료 나이를 입력하세요 =>");
			try {
				max = Integer.parseInt(s.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자 입력한거 맞아요?");
			}
		}
		
	}
}
