package ch07.HW3.Game;

public class StarRail extends Game {

	StarRail(String iD) {
		super(iD);
	}
	void connect() {
		System.out.println("[" + ID +"]"+ "로그인");
		System.out.println();
		System.out.println("[" + ID +"]"+ this.getClass().getSimpleName()+  "서버 접속 중");
		System.out.println("[" + ID +"]"+ this.getClass().getSimpleName()+  "서버 접속 완료");
		System.out.println("!!! welcome to " + this.getClass().getSimpleName() + "!!!");
	}
	void play() {
		System.out.println();
		System.out.println("[" + ID +"]"+ this.getClass().getSimpleName()+  "게임시작");
	}
}
