package ch14.sec03;

import java.awt.*;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//쓰레드 생성자 매겨변수 Runnable 타입을 호출
		//Runnable은 인터페이스 따라서 익명 인터페이스 객체 구현으로 매개변수 전달
		//당연히 객체 구현할때 런을 재정의
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {}
				}
			}
		});
		//재정의된 쓰레드의 런이 시작
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		
		System.out.println("\n=====================\n");
		
		//매개변수 없는 쓰레드 생성자. 의 익명구현 객체 문법
		// 익명구현 객체는 재정의 구현이 포함. 런을 직접 재정의
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {}
				}
			}
		
		};
		t1.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("땅");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}

}
