package ch05.sec07;

public class MultimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = new int[10][];
		
		for(int i=0; i<10; i++) {
			scores[i] = new int[10];
			for(int j=0; j<10; j++) {
				String s = i+""+j;
				scores[i][j] = Integer.parseInt(s);			
			}
		}
		
		System.out.print(scores);
	}

}
