package ch07.HW3.Game;

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarRail star = new StarRail("춘식이");
		star.connect();
		star.play();
		
		MapleStory maple = new MapleStory("춘식이");
		maple.connect();
		maple.play();
	}

}
