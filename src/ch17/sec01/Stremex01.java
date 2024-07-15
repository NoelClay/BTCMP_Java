package ch17.sec01;

import java.util.*;
import java.util.stream.*;

public class Stremex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> ss = new HashSet<>();
		
		for (int i =0; i<7; i++) {
			ss.add(Integer.toString(i));
		}
	
		Stream<String> stream = ss.stream();
		stream.forEach(x -> System.out.println(x));
		
		Stream<String> ps = ss.parallelStream();
		ps.forEach(x-> {
			System.out.println(x + " : " + Thread.currentThread().getName());
		});
	}

}
