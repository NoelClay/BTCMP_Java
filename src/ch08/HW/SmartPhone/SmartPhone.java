package ch08.HW.SmartPhone;

public class SmartPhone implements SmartDisplay{

	public void flex() {
		
		System.out.println(this.getClass().getSimpleName() + ".flex()");
		//System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
		print();
	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + ".roll()");
		//System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		print();
	}
	
	void print() {
		//이런식으로는 절대 하면 안될듯 System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
		System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
	}
}
