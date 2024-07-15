package ch17.hw;

import java.util.*;
import java.util.stream.*;

public class DishBiz {

	public List<Dish> dishList;
	public Stream<Dish> sdish;
	
	public DishBiz(List<Dish> dishList) {
		// TODO Auto-generated constructor stub
		this.dishList = dishList;
	}

	public void printAllDishes() {
		System.out.println("\n\n=========모두출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream();
		sdish.forEach(System.out::println);
		
	}

	public void PrintMeatDish() {
		System.out.println("\n\n=========고기출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream().filter(x -> x.category().equals("고기"));
		sdish.forEach(System.out::println);
		
	}

	public void PrintFishDish() {
		System.out.println("\n\n=========생선출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream().filter(x -> x.category().equals("생선"));
		sdish.forEach(System.out::println);
		
	}

	public void PrintVegetarianDish() {
		System.out.println("\n\n=========채식출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream().filter(x -> x.isVT());
		sdish.forEach(System.out::println);
	}

	public void PrintHighCaloriesDish() {
		System.out.println("\n\n=========고열량출력=====");
		System.out.println("* 400칼로리 이상");
		// TODO Auto-generated method stub
		sdish = dishList.stream().filter(x -> x.calory() >= 400).sorted((x,y)-> Integer.compare(y.calory(), x.calory()));
		sdish.forEach(System.out::println);
		
	}

	public void PrintLowCaloriesDish() {
		System.out.println("\n\n=========저열량출력=====");
		System.out.println("* 400 칼로리 이하");
		// TODO Auto-generated method stub
		sdish = dishList.stream().filter(x -> x.calory() <= 400).sorted((x,y)-> Integer.compare(y.calory(), x.calory()));
		sdish.forEach(System.out::println);
		
	}

	public void PrintHowManyDishes() {
		System.out.println("\n\n=========음식 몇개 출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream();
		System.out.println(sdish.count()+ "개");
		
	}

	public void PrintAverageCalory() {
		System.out.println("\n\n=========평균 칼로리 출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream();
		//sdish.mapToInt(x -> x.calory()).mapToDouble(x -> x).average().getAsDouble();
		System.out.println(sdish.mapToInt(x -> x.calory()).mapToDouble(x->x).average().getAsDouble() + "(kcal)");
	}

	public void PrintTotalCalory() {
		System.out.println("\n\n=========전체 칼로리 출력=====");
		// TODO Auto-generated method stub
		sdish = dishList.stream();
		System.out.println(sdish.mapToInt(x -> x.calory()).sum()+ "(kcal)");
	}

}
