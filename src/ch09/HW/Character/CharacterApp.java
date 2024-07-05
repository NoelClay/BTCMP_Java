package ch09.HW.Character;

public class CharacterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("++++++AnonymousObject+++");
		System.out.println("++++++1+++");
		
		Character c1 = new Character() {
			public void attack() {
				System.out.println("근거리 공격");
			}
		};
		c1.attack();
		
		System.out.println("\n++++++2+++");
		
		Character c2 = new Character("에이스") {
			public void attack() {
				System.out.println("소총 공격");
			}
			
		};
		c2.attack();
		System.out.println(c2.getName());
		
		System.out.println("\n++++++3+++");
		
		Character c3 = new Character("제임스", "라이플맨") {
			public void attack() {
				System.out.println("소총 공격");
			}
			
		};
		c3.attack();
		c3.printInfo();
	}
	
	}
	