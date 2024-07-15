package ch17.hw;

import java.util.*;
import java.util.stream.*;

public class NoReUseApp {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("아메리카노");
		set.add("마키아또");
		set.add("카푸치노");

		System.out.println("===== Stream =====");
		Stream<String> stream1 = set.stream();
		stream1.forEach(a -> System.out.println(a));

		// ========================================
		// # 재사용 불가
		// - stream은 1번 사용하면 재사용 불가
		// - 재사용 할 경우, 예외가 발생한다.
		// ========================================
		System.out.println("\n===== 재사용 불가 =====");
		System.out.println("----- 예외 발생-----");
		// java.lang.IllegalStateException: stream has already been operated upon or
		// closed
		
		Stream<String> stream3 = set.stream();
		stream3.forEach(a -> System.out.println(a)); // 예외

		// ----------------------------------------
		// # 해결방안
		// - 스트림을 새로 생성한다.
		// ----------------------------------------
		System.out.println("\n----- 해결방안 -----");
		Stream<String> stream2 = set.stream();
		stream2.forEach(a -> System.out.println(a));
	}

}
