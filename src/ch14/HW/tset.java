package ch14.HW;

import java.time.*;
import java.time.format.*;

public class tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("ss");
		
		String snow = now.format(formatter);
		String stime = now.format(tformatter);
		int time = Integer.parseInt(stime);
		
		System.out.println(now);
		System.out.println(formatter);
		System.out.println(tformatter);
		System.out.println(snow);
		System.out.println(stime);
		System.out.println(time);

	}

}
