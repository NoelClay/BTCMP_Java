package ch14.HW;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
        for (int i = 0; i < 3000; i++) {
            System.out.print("-");
        }

	}

}
