package ch07.HW2.Character;

public class Knight extends Character {

	Knight(String name, String job) {

		super(name, job);
		this.job = this.getClass().getSimpleName();
		// TODO Auto-generated constructor stub
		attack = EAttack.SHORT;
	}
	Knight(String s){
		this(s, "");
	}
}
