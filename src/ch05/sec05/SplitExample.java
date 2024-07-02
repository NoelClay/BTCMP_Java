package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1, 자바, 참조타입, 홍길동";
		String[] tokens = board.split(",");
		
		for(String s : tokens) {
			System.out.println(s);
		}

	}

}
