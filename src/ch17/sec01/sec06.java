package ch17.sec01;

import java.util.*;

import ch16.sec02.*;

public class sec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	    
	    System.out.println("==========");
	    System.out.println("=========");
	    System.out.println("========");
	    
	    //list.stream().mapToInt(x -> x.age).forEach(System.out::println);
	    
	    System.out.println("==========");
	    System.out.println("=========");
	    System.out.println("========");
	    
	    List<Integer> list2 = new ArrayList<Integer>();
	    
	    
	    list2.stream().mapToDouble(null).average();
	}

}
