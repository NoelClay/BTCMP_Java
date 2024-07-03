package ch07.HW2.Animal_App;

public class Biz {

	public void cryAnimal(Animal a) {
		System.out.println("크라이"+ a.getClass().getSimpleName());
	}
	
	public void cryBird(Bird a) {
		System.out.println("크라이"+ a.getClass().getSimpleName());
	}
	
	public void cryCow(Cow a) {
		System.out.println("크라이"+ a.getClass().getSimpleName());
	}
}
