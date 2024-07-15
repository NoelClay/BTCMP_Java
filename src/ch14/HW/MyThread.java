package ch14.HW;

public class MyThread extends Thread{

	public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.print("-");
        }

	}
}
