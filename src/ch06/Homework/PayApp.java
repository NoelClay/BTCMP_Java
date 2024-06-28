package ch06.Homework;

public class PayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hourPay = 9860;
		Pay p = new Pay();
		
		System.out.println("\n====하루급여=====");
		int dayPay = p.getDayPay(hourPay);
		System.out.println("급여 = " + dayPay);
		
		System.out.println("\n====주 급여=====");
		int weekPay = p.getWeekPay(hourPay);
		System.out.println("급여 = " + weekPay);
		
		System.out.println("\n====연 급여=====");
		int yearPay = p.getYearPay(hourPay);
		System.out.println("급여 = " + yearPay);
		
		System.out.println("\n=============\n");
		
		Pay p2 = new Pay(hourPay);
		System.out.println("\n====하루급여=====");
		int dayPay2 = p2.getDayPay();
		System.out.println("급여 = " + dayPay2);
		
		System.out.println("\n====주 급여=====");
		int weekPay2 = p2.getWeekPay();
		System.out.println("급여 = " + weekPay2);
		
		System.out.println("\n====연 급여=====");
		int yearPay2 = p2.getYearPay();
		System.out.println("급여 = " + yearPay2);
	}

}
