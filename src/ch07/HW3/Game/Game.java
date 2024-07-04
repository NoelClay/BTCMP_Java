package ch07.HW3.Game;

public abstract class Game {

	String ID;
	
	
	Game(String iD) {
		ID = iD;
		System.out.println("===============");
	}
	
	abstract void connect();
	abstract void play();
}
