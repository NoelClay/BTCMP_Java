package ch15.HW.PersonApp;

import java.util.*;

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
		
	}

}
