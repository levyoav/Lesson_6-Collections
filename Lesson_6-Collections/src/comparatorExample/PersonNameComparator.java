package comparatorExample;

import java.util.Comparator;

import comparableExample.Person;

//In order to be able to sort a list of Person objects according to something else 
//other than the natural order using the 'Collections.sort(List, Comparator)' method,
//we need to create a comparator class that implements the interface Comparator and 
//implement that sorting by overriding the compare(Object, Object) method.
public class PersonNameComparator implements Comparator {

	public int compare(Object o1, Object o2) {

		Person p1 = (Person) o1;
		Person p2 = (Person) o2;

		//In this comparator, the comparison between 2 Person objects is done by 
		//comparing their name instead of their id (String natural order). This is done
		//by using the compareTo() method of the class String.
		return p1.getName().compareTo(p2.getName());
	}

}
