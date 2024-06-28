package ch02.sec01;

class data{
	int hour =0 ;
	int minute = 0;
}

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data dInstance = new data();
		dInstance.hour = 3;
		dInstance.minute = 5;
		
		System.out.println(dInstance.hour+"시간 "+dInstance.minute+"분");
		
		int totalMinute = (dInstance.hour*60)+dInstance.minute;
		System.out.println("총 "+totalMinute+"분");
		
		ChangeHourMinute(dInstance);
		System.out.println(dInstance.hour+"시간 "+dInstance.minute+"분");
		int totalMinute2 = (dInstance.hour*60)+dInstance.minute;
		System.out.println("총 "+totalMinute2+"분");
	}
	public static void ChangeHourMinute(data dParam) {
		int temp = dParam.hour;
		dParam.hour = dParam.minute;
		dParam.minute = temp;		
	}
}
