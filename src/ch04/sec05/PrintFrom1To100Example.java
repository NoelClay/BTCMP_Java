package ch04.sec05;

public class PrintFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1 , sum=0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.printf("1~%d의 합은 %d이다.",  i-1, sum);
	}

}
