package ch07.HW2.Character;

public class Archer extends Character {

	Archer(String name, String job) {

		super(name, job);
		this.job = this.getClass().getSimpleName();
		// TODO Auto-generated constructor stub
		attack = EAttack.LONG;
	}
	Archer(String s){
		this(s, "");
	}
	
}
