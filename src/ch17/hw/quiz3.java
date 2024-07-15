package ch17.hw;

import java.util.*;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Dish>	dishList = DishUtil.getAllDishes();
		//해결
		
		DishBiz dishBiz = new DishBiz(dishList);
		//
		
		dishBiz.printAllDishes();
		dishBiz.PrintMeatDish();
		dishBiz.PrintFishDish();
		dishBiz.PrintVegetarianDish();		
		dishBiz.PrintHighCaloriesDish();
		dishBiz.PrintLowCaloriesDish();
		dishBiz.PrintHowManyDishes();
		dishBiz.PrintTotalCalory();
		dishBiz.PrintAverageCalory();
		
	}

}
