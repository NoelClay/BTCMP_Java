package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) +1;
		System.out.println(num);
		
		switch(num) {
			case 1:
				System.out.printf("%d번이 나왔습니다", num);
				break;
			case 2:
				System.out.printf("%d번이 나왔습니다", num);
				break;
			case 3:
				System.out.printf("%d번이 나왔습니다", num);
				break;
			case 4:
				System.out.printf("%d번이 나왔습니다", num);
				break;
			case 5:
				System.out.printf("%d번이 나왔습니다", num);
				break;
			default:
				System.out.printf("%d번이 나왔습니다", num);
		}
	}

}
