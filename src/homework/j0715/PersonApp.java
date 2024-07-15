package homework.j0715;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== start====");
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		boolean whileLoop = true;
		while(whileLoop) {
			try {
				System.out.println("\n==== 메뉴선택 ====");
				System.out.println("=====1. 전체출력====");
				System.out.println("==== 2. 등록 ====");
				System.out.println("==== 3. 수정 ====");
				System.out.println("==== 4. 삭제 ====");
				System.out.println("==== 5. 조회(성별) ====");
				System.out.println("==== 6. 조회(나이구간) ====");
				System.out.println("==== 9. 종료() ====");
				
				System.out.print("메뉴를 선택하세요=>");
				String menu = sc.nextLine();
				
				switch(menu){
					case "1":
						System.out.println("\n==== 전체출력 ====");
						manager.printPersonList();
						break;
					case "2":
						System.out.println("\n==== 등록 ====");
						manager.addPerson(sc);
						break;
					case "3":
						System.out.println("\n==== 수정 ====");
						manager.updatePerson(sc);
						break;
					case "4":
						System.out.println("\n==== 삭제 ====");
						manager.deletePerson(sc);
						break;
					case "5":
						System.out.println("\n==== [조회]성별 ====");
						manager.selectPersonBySex(sc);
						break;
					case "6":
						System.out.println("\n==== [조회]나이 구간 ====");
						manager.selectPersonBetweenAge(sc);
						break;
					case "9":
						System.out.println("\n==== [종료] ====");
						System.out.println("\n====프로그램을 종료합니다.====");
						whileLoop = false;
						break;
					default:
						System.out.println("\n==== 없는 메뉴 다시 선택 ====");
						break;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		sc.close();
		System.out.println("\n====END====");
	}

}
