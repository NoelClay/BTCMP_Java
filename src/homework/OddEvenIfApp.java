package homework;

public class OddEvenIfApp {
	public static void main(String[]args) {
		//홀수 짝수 구하기
		int[] listData = {5, 10};
		for(int i=0; i<listData.length; i++) {
			if(listData[i]%2==0) {
				System.out.println(listData[i] + "짝수");
			}
			else {
				System.out.println(listData[i] + "홀수");
			}
		}
	}
}
