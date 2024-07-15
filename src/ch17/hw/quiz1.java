package ch17.hw;

import java.util.*;
import java.util.stream.*;

import ch16.sec02.*;

public class quiz1 {
	public static void main(String[] args) {
	    System.out.println("===== List<Person> =====");
	    List<Person> list = new ArrayList<Person>();
	    list.add(new Person("Paige", 20));
	    list.add(new Person("James", 30));
	    list.add(new Person("Smith", 40));
	    list.add(new Person("Tom", 50));
	    list.add(new Person("Victoria", 60));
	    for (Person p : list) {
	        p.printInfo();
	    }

	    // =========================================
	    // 필터링 : 이름
	    // =========================================
	    System.out.println("\n===== 이름 : James =====");
	    
	    Stream<Person> ss = list.stream();
	    ss.filter(x -> x.name == "James").forEach(x-> x.printInfo());

	    // =========================================
	    // 필터링 : 나이
	    // =========================================
	    System.out.println("\n===== 나이 : 50세 이상 =====");
	    
	    Stream<Person> ss2 = list.stream();
	    ss2.filter(x -> x.age >= 50).forEach(x-> x.printInfo());

	    // =========================================
	    // 필터링 : 복합
	    // =========================================
	    System.out.println("\n===== 이름에 a 가 있고, 나이가 60세 미만 =====");
	    
	    Stream<Person> ss3 = list.stream();
	    ss3.filter(x -> x.age < 30 && x.name.contains("a")).forEach(x-> x.printInfo());
	}

}
