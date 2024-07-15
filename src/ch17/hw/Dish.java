package ch17.hw;

public record Dish(String food, String category, boolean isVT, int calory) {

	public String toString(){
		String korBool = isVT ? "가능" : "불가능";
		return food+" | " + category +" | " + korBool + " | " +calory+"(kcal)";
	}
}
