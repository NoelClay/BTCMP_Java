package ch07.HW2.Character;

public class Character {
	public String name;
	public String job;
	public EAttack attack = EAttack.BASIC;
	
	Character(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	void printInfo() {
		System.out.println("이름="+name+" | 캐릭터="+job);
	}
		
	void attack() {
		System.out.println("공격");
	}

	String getKorAttackType() {
		//String result;
		return switch(attack) {
		case LONG -> "원거리";
		case SHORT -> "근거리";
		case MAGIC -> "마법";
		default -> "일반공격";
		};
		//return result;
	}
//	String getKorAttackType() {
//		String result;
//		switch(attack) {
//		case LONG -> result = "원거리";
//		case SHORT -> result = "근거리";
//		case MAGIC -> result = "마법";
//		default -> result = "일반공격";
//		}
//		return result;
//	}

	public void typeAttack() {
		// TODO Auto-generated method stub
		System.out.printf("[%s / %s] %s",name,job, getKorAttackType());
		System.out.println();
	}
}

//void attack() {
//System.out.println("공격 타입: "+getKorAttackType());
//}

//String getKorAttackType() {
//	String result;
//	switch(attack.toString()) {
//	case "LONG" -> result = "원거리";
//	case "SHORT" -> result = "근거리";
//	case "MAGIC" -> result = "마법";
//	default -> result = "일반공격";
//	}
//	return result;
//}
