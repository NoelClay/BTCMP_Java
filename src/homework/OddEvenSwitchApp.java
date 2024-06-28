package homework;

public class OddEvenSwitchApp {
	public static void main(String[]args) {
		//홀수 짝수 구하기
		int[] listData = {5, 10};
		for(int i=0; i<listData.length; i++) {
			int testCase = listData[i]%2;
			switch(testCase) {
			case 0:
				System.out.println(listData[i] + "짝수");
				break;
			default :
				System.out.println(listData[i] + "홀수");
			}
		}
	}
}
