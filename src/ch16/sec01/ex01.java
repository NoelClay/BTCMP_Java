package ch16.sec01;

public class ex01 {

	public static void action(Calculable calculable) {
		int x = 10;
		int y = 20;
		calculable.calculate(x, y);
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		action((x, y)-> {
			int result = x+ y;
			System.out.println(result);
		});
		
		action((x, y)-> {
			int result = x - y;
			System.out.println(result);
		});
	}

}
