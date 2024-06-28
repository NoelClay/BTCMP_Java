package homework;

public class HakjumIfApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 88;
		int eng = 92;
		int math = 100;
		
		int total = kor + eng + math;
		int avg = total/3;
		String grade = " ";
		if(avg>=90) {
			if(avg>=95) {
				grade = "A+";
			}
			else {grade = "A";}
		}
		else {
			if(avg>=85)
				grade="B+";
			else
				grade="B";
		}
		
		System.out.printf("국어=%d 영어=%d 수학=%d\n", kor, eng, math);
		System.out.printf("합계=%d 평균=%d 학점=%s", total, avg, grade);
	}

}
