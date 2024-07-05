package ch09.HW.City;

public class CityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========Variable======");
		System.out.println("\n=========extends Class======");
		City s = new Seoul();
		s.printInfo();
		
		City b = new Busan();
		b.printInfo();
		
		System.out.println("\n========Anonymous======");
		City jeju = new City() {
			public void printInfo() {
				System.out.println("제주");
				this.name = "제주";
				super.printInfo();
			}
		};
		jeju.printInfo();
		
		City naju = new City() {
			public void printInfo() {
				System.out.println("나주");
				//this는 못쓴다 에러네 그럴만하네 this.name = "제주";
				//this.printInfo();
				//super.name = "나주";
				//super.printInfo();
			}
		};
		naju.printInfo();
		
		System.out.println("\n========method======");
		System.out.println("\n========extends class======");
		Biz z = new Biz();
		z.biz(s);
		z.biz(jeju);
		
		System.out.println("\n========Anonymous======");
		z.biz( new City() { 
				{this.name = "전주";}
			}
		);
	}

}
