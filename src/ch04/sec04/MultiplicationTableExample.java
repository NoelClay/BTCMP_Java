package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구 구 단");
		System.out.println("===========");
		
		for(int i=2; i<=9; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j );
			}
		}
	}

}
