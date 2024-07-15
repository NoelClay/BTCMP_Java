package ch14.HW;

import java.time.*;
import java.time.format.*;

public class alarm1 extends Thread {

	boolean work = false;

	
	public void run() {

	
		while(true) {
			LocalDateTime now = LocalDateTime.now();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
			DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("ss");
			
			String snow = now.format(formatter);
			String stime = now.format(tformatter);
			int time = Integer.parseInt(stime);
			try {
				if(time % 10 == 0 ) {
					this.yield();
				}

				if(time % 10 != 0 ) {
					System.out.println(snow+" 1초 ");
				}
				Thread.sleep(1000);
			}catch(Exception e) {}

		}
	}
}
