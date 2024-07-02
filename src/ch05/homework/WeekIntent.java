package ch05.homework;

public class WeekIntent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dayString = "일,월,화,수,목,금,토";
		
		play(dayString);
		
	}
	static void play(String dayString) {
		String[] days = dayString.split(",");
		
		for(int i=0; i<days.length; i++) {
			//String tempTap = "\t"; 
			for(int j=0; j<i; j++) {
				System.out.print("\t");
			}
			System.out.println(days[i]+"요일");
		}
	}

}
