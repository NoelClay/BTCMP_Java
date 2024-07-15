package ch17.hw;

import java.io.*;
import java.util.*;

public class DishUtil {

//	public static String[] foods = {"갈비찜","불고기", "산적", "떡국", "잡채", "취나물무침", "배추김치","고등어구이","갈치구이", "사과"} ;
//	public static String[] categories = {"고기","고기", "고기", "기타", "기타", "기타", "기타","생선","생선", "과일"};
//	public static Boolean[] isVTes = {false, false, false, false, false, true, true, false, false, true};
//	public static int[] calories = {	531,471,653,440,191, 30, 25,  302,  450, 50};

	public static List<String> foods = new ArrayList<>();
	public static List<String> categories = new ArrayList<>();
	public static List<Boolean> isVTes = new ArrayList<>();
	public static List<Integer> calories = new ArrayList<>();
	public static int len=0;
	
	public static List<Dish> getAllDishes() {
		// TODO Auto-generated method stub
		readCSV();
		List<Dish> result = new ArrayList<Dish>();
		for(int i=0; i<len; i++) {
			result.add(new Dish(foods.get(i), categories.get(i), isVTes.get(i) , calories.get(i)));
		}
		
		return result;
	}

	public static void readCSV() {
		len = 0;
		try {
			File file = new File("C:\\Users\\KOSA\\Desktop\\JAVA_KNY\\dishset.csv");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine())!=null) {
				List<String> aLine = new ArrayList<String>();
				String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
				//aLine = Arrays.asList(lineArr);
				//System.out.println(aLine);
				
				foods.add(lineArr[0]);
				categories.add(lineArr[1]);
				isVTes.add(lineArr[2]=="TRUE" ? true:false );
				calories.add(Integer.parseInt(lineArr[3]));
				len++;
			}
		} catch (Exception e) {}
	}
}
