package ch05.homework;

public class WeekDayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] weekDay;
		
		weekDay = new String[]{"월", "화", "수", "목", "금", "토", "일"};

		System.out.println("==========Week Day===========");
		for (int i=0; i<7; i++) {
			System.out.println("weekDay["+i+"] "+weekDay[i]+"요일");
		}
	}
}
