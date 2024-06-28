package ch06.Homework;

public class MessageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.printInfo("안녕하세요");
		msg.printInfo(0);
		msg.printInfo("안녕하세요", 50);
		msg.printInfo(60, "안녕하세요");
	}

}
