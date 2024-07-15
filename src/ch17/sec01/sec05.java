package ch17.sec01;

import java.util.*;
import java.util.stream.*;

public class sec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//필터 사용 해보기
		List<String> ls = new ArrayList<>();
		
		for(int i = 0; i<999; i++) {
			ls.add(Integer.toString(i));
		}
		
		Stream<String> ss = ls.stream();
		
		ss.distinct().filter(x -> Integer.parseInt(x)%10 == 0).forEach(x->System.out.println(x));
		
	}

}
