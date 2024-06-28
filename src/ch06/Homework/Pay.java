package ch06.Homework;

public class Pay {
	int hourPay;
	
	public Pay(int i) {
		hourPay = i;
	}
	public Pay() {
		
	}
	public int getDayPay(int hourPay2) {
		// TODO Auto-generated method stub
		return hourPay2*8;
	}
	public int getDayPay() {
		// TODO Auto-generated method stub
		return hourPay*8;
	}
	
	public int getWeekPay(int hourPay2) {
		// TODO Auto-generated method stub
		return hourPay2*8*5;
	}
	public int getWeekPay() {
		// TODO Auto-generated method stub
		return hourPay*8*5;
	}
	
	public int getYearPay(int hourPay2) {
		// TODO Auto-generated method stub
		return hourPay2*8*5*52;
	}
	public int getYearPay() {
		// TODO Auto-generated method stub
		return hourPay*8*5*52;
	}
	
}
