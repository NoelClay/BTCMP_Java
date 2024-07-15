package ch16.sec02;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnok = new Button();
		
		btnok.SetC(() -> System.out.println("ok click"));
		
		btnok.Click();
		
		Button btnCancle = new Button();
		
		btnCancle.SetC(()->{
			 System.out.println("Cancle click");
		}
				);
		
		btnCancle.Click();

	}

}
