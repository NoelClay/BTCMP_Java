package ch17.hw;

public record Apple(int weight, Color color) {

	public void printInfo() {
		System.out.println("컬러="+color.toString()+" | 무게="+weight);
	}
}
