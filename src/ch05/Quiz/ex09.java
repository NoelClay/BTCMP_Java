package ch05.Quiz;

import java.util.*;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn = new Scanner(System.in);
		String[] branch = {"학생수", "점수입력", "점수리스트", "분석", "종료"};
		int students;
		int[] scores;
		int maxScore;
		int minScore;
		
		{
			scores = null; students = 0;
		}
		
		while(true){
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");
			String s = sIn.nextLine();
			int n;
			
			try {
				n = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.print("1~5 정수 한자리만 입력하세요. 다시하세요 \n");
				continue;
			}

			if(n<1 || n>5) {
				System.out.print("1~5 정수 한자리만 입력하세요. 다시하세요 \n");
				continue;
			}
			
			if(n == 1) {
				System.out.print("학생수>");
				String sss = sIn.nextLine();
				int nnnn;
				
				try {
					nnnn = Integer.parseInt(sss);
				} catch (NumberFormatException e) {
					System.out.print("정수만 입력하세요. 다시하세요 \n");
					continue;
				}
				students = nnnn;	
				scores = new int[nnnn];
			}
			else if(n==2) {
				for(int i = 0; i<students; i++) {
					System.out.printf("scores[%d]>", i);
					String ss = sIn.nextLine();
					int nn;
					try {
						nn = Integer.parseInt(ss);
					} catch (NumberFormatException e) {
						System.out.print("정수만 입력하세요. 다시하세요 \n");
						i--;
						continue;
					}
					scores[i] = nn;
				}
				
			}
			else if(n==3) {
				for(int i = 0; i<students; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);					
				}
			
			}
			else if(n==4) {
				maxScore = -9999;
				minScore = 9999;
				for(int i = 0; i<students; i++) {
					maxScore = (maxScore < scores[i] ? scores[i] : maxScore);	
					minScore = (minScore > scores[i] ? scores[i] : minScore);	
				}
				System.out.printf("최고 점수는 %d\n 최저 점수는 %d\n", maxScore, minScore);
			}
			else if(n==5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.print("1~5 정수 한자리만 입력하세요. 다시하세요 \n");
			}			
		}
	}
}
