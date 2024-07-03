package ch07.HW2.Animal_App;

public class App {

	public static void main(String[] args) {

		System.out.println("===== cry() =====");
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cow cow = new Cow();

		animal.cry();
		bird.cry();
		cow.cry();

		System.out.println("\n===== Polymorphic Argument =====");
		Biz biz = new Biz();

		System.out.println("----- biz.cryAnimal() -----");
		biz.cryAnimal(animal);
		biz.cryAnimal(bird); 
		biz.cryAnimal(cow); 

		System.out.println("\n----- biz.cryBird() -----");
		//biz.cryBird((Bird)animal); 
		biz.cryBird(bird);
		//biz.cryBird((Bird)((Animal)cow)); // Error

		System.out.println("\n----- biz.cryCow() -----");
		//biz.cryCow((Cow)animal);
		//biz.cryCow((Cow)((Animal)bird));
		biz.cryCow(cow);

	}
}
