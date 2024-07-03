package ch07.HW2.Character;

public class Wizard extends Character {
	Wizard(String name, String job) {

		super(name, job);
		this.job = this.getClass().getSimpleName();
		// TODO Auto-generated constructor stub
		attack = EAttack.MAGIC;
	}
	Wizard(String s){
		this(s, "");
	}

}
