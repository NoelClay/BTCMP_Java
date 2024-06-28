package homework;

public class HakjumSwitchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 88;
		int eng = 92;
		int math = 100;
		
		int total = kor + eng + math;
		int avg = total/3;
		String grade = " ";
		
		int test = (int)(avg/10);
		switch (test) {
		case 9 -> grade = "A";
		case 8 -> grade = "B";
		case 7 -> grade = "C";
		default -> grade = "D";
		}
		
		System.out.printf("국어=%d 영어=%d 수학=%d\n", kor, eng, math);
		System.out.printf("합계=%d 평균=%d 학점=%s", total, avg, grade);
	}

}
