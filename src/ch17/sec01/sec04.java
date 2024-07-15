package ch17.sec01;

import java.util.*;
import java.util.stream.*;

public class sec04 {

	public static int sum = 0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strA = {"김", "이", "박"};
		
		//Stream<String> ss = strA.stream(); 이건 지원안한다. strA는 String[] 타입인데
		//여기에는 stream 반환 메서드 같은게 없기 때문 
		
		Stream<String> ss = Arrays.stream(strA);
		
		//ss.forEach(x -> System.out.println(x + " , "));
		ss.forEach(x -> System.out.println(x));
		
		
		IntStream is = IntStream.range(0, 100);
		is.forEach(x -> {
			sum+=x;
			 System.out.println(x);
		});
		 System.out.println(sum);
		
	}

}
