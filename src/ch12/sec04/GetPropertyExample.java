package ch12.sec04;

import java.util.*;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
		
		Set set = props.keySet();
		
		for(Object obj : set) {
			String key = (String) obj;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
		
	}

}
