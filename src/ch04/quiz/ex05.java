package ch04.quiz;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				if(4*i + 5*j == 60)
					System.out.printf("( %d, %d )\n", i, j );	
			}
		}

	}

}
