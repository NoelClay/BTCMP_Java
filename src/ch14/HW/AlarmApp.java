package ch14.HW;

import java.time.*;
import java.time.format.*;

public class AlarmApp {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("ss");
		
		String snow = now.format(formatter);
		String stime = now.format(tformatter);
		int time = Integer.parseInt(stime);
		
		// TODO Auto-generated method stub
		alarm1 t1 = new alarm1();
		alarm2 t2 = new alarm2();
		
		t1.start();
		t2.start();
	}

}
