package ch06.Homework;

public class FootBallPlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootBallPlayer fp1 = new FootBallPlayer();
		fp1.PrintInfo();
		
		FootBallPlayer fp2 = new FootBallPlayer();
		fp2.setName("손흥민");
		fp2.setUniformNumber("7");
		fp2.setTeamName("토트넘");
		fp2.setSpeed(5);
		fp2.setTech(5);
		fp2.PrintInfo();
		
		FootBallPlayer fp3 = new FootBallPlayer("이강인", "PSG", "19", 4, 5);
		fp3.PrintInfo();
	}

}
