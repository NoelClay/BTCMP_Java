package ch15.HW.PersonApp;

import java.util.*;
import java.util.Map.*;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person>personList = new ArrayList<Person>();
		
		personList.add(new Person("Paige", 20));
		personList.add(new Person("Smith", 25));
		personList.add(new Person("Talyer", 30));
		
		
		for(int i=0 ; i<personList.size(); i++) {
			Person person = personList.get(i);
			person.printInfo();
		}
		
		System.out.println("\n=========================\n");
		Set<Person> pset = new HashSet<>();
		
		pset.add(new Person("Paige", 20));
		pset.add(new Person("Smith", 25));
		pset.add(new Person("Talyer", 30));
		
		for(Person p: pset) {
			p.printInfo();
		}
		
		System.out.println("\n=========================\n");
		
		Iterator<Person> pIter = pset.iterator();
		
		while(pIter.hasNext()) {
			pIter.next().printInfo();
		}
		
		System.out.println("\n=========================\n");
		System.out.println("\n========클래스=========\n");
		System.out.println("\n=========================\n");
		
		Person p = new Person("Kim", 20);
		p.printInfo();
		
		Person s = new Student("Smith", 25, "2024-001");
		s.printInfo();
		
		Person t = new Teacher("tom", 30, "Music");
		t.printInfo();
		
		System.out.println("\n========MAP=========\n");
		Map<String, Person>personMap2 = new HashMap<>();
		
		
		personMap2.put("s1", s);
		personMap2.put("s2", new Student("Susan", 28, "2024-002"));
		personMap2.put("t1", t);
		personMap2.put("t2", new Teacher("tom", 32, "ART"));
		
		Set<String> keyset = personMap2.keySet();
		Iterator<String> i = keyset.iterator();
		while(i.hasNext()) {
			String ss = i.next();
			Person value = personMap2.get(ss);
			if(value.getClass().getSimpleName() == s.getClass().getSimpleName())
				System.out.print("[학생]");
			else if(value.getClass().getSimpleName() == t.getClass().getSimpleName())
				System.out.print("[교사]");
			value.printInfo();
		}
		System.out.println("\n=========MAP2==========\n");
		
		Set<Entry<String, Person>> entryset = personMap2.entrySet();	
		Iterator<Entry<String,Person>> IEntry = entryset.iterator();
		while(IEntry.hasNext()) {
			Entry<String, Person> eEntry = IEntry.next();
			
			String ss = eEntry.getKey();
			Person value = eEntry.getValue();
			
			if(value.getClass().getSimpleName() == Student.class.getSimpleName())
				System.out.print("[학생]");
			else if(value.getClass().getSimpleName() == Teacher.class.getSimpleName())
				System.out.print("[교사]");
			value.printInfo();
		}
		
		
		
	}

}
