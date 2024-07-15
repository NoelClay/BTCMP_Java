package ch14.sec03;

import java.awt.*;

public class beepprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit t = Toolkit.getDefaultToolkit();
		t.beep();
		
		for(int i = 0; i < 5; i++) {
			t.beep();
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
