package ch17.hw;

import java.util.*;

public class quiz2 {

	public static void main(String[] args){
	    List<Apple> inventory = Arrays.asList(
	        new Apple(200, Color.GREEN),
	        new Apple(180, Color.RED),
	        new Apple(120, Color.RED),
	        new Apple(160, Color.RED),
	        new Apple(80, Color.GREEN),
	        new Apple(155, Color.GREEN)
	    );

	    System.out.println("===== 녹색 사과(정렬: 무게 오름차순) =====");
	    List<Apple> greenApples = null;

	    greenApples = inventory.stream().filter(x-> x.color()==Color.GREEN).sorted((x,y)-> Integer.compare(x.weight(), y.weight())).toList();
	    // [Your code here]

	    for(Apple apple : greenApples){
	        apple.printInfo();
	    }

	    System.out.println("\n===== 빨간 사과(정렬: 무게 내림차순) =====");
	    List<Apple> redApples = null;

	    // [Your code here]

	    redApples = inventory.stream().filter(x-> x.color()==Color.RED).sorted((x,y)-> Integer.compare(y.weight(), x.weight())).toList();
	    for(Apple apple : redApples){
	        apple.printInfo();
	    }

	    System.out.println("\n===== 무거운 사과(정렬: 무게 오름차순) =====");
	    System.out.println("기준: 무게 150 이상");
	    List<Apple> heavyApples = null;

	    // [Your code here]

	    heavyApples = inventory.stream().filter(x-> x.weight() >= 150).sorted((x,y)-> Integer.compare(x.weight(), y.weight())).toList();

	    for(Apple apple : heavyApples){
	        apple.printInfo();
	    }

	    System.out.println("\n===== 무거운 빨간 사과(정렬: 무게 오름차순) =====");
	    System.out.println("기준: 무게 150 이상");
	    List<Apple> redHeavyApples = null;

	    // [Your code here]

	    redHeavyApples = inventory.stream().filter(x-> x.weight() >= 150 && x.color()==Color.RED).sorted((x,y)-> Integer.compare(x.weight(), y.weight())).toList();

	    for(Apple apple : redHeavyApples){
	        apple.printInfo();
	    }
	    

	}


}
