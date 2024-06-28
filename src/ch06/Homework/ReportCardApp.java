package ch06.Homework;

public class ReportCardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n====Object1=====");
		
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78;
		
		ReportCard rc1 = new ReportCard("Victoria", korean1, english1, math1);
		
		int sum1 = rc1.sum();
		System.out.println("합계="+sum1);
		int average1 = rc1.average();
		System.out.println("평균="+average1);
		char hakjum1 = rc1.hakjum();
		System.out.println("학점="+hakjum1);
		
		System.out.println("\n====printInfo=====");
		rc1.printInfo();
		
		System.out.println("\n====Object2=====");
		
		int korean2 = 88;
		int english2 = 100;
		int math2 = 92;
		ReportCard rc2 = new ReportCard("Paige");
		rc2.setKorean(korean2);
		rc2.setEnglish(english2);
		rc2.setMath(math2);
		
		int sum2 = rc2.sum();
		System.out.println("합계="+sum2);
		int average2 = rc2.average();
		System.out.println("평균="+average2);
		char hakjum2 = rc2.hakjum();
		System.out.println("학점="+hakjum2);
		
		System.out.println("\n====printInfo=====");
		rc2.printInfo();
		
		
	}

}
