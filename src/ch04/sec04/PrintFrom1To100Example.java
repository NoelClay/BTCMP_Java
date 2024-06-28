package ch04.sec04;

public class PrintFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , sum=0;
		
		for(i=1; i<=100 ; i++) {
			sum += i;
		}
		System.out.printf("1~%d의 합은 %d이다.",  i-1, sum);
	}

}
