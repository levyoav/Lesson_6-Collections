package comparatorExample;

import java.util.Comparator;

import comparableExample.Person;

//In order to be able to sort a list of Person objects according to something else 
//other than the natural order using the 'Collections.sort(List, Comparator)' method,
//we need to create a comparator class that implements the interface Comparator and 
//implement that sorting by overriding the compare(Object, Object) method. 
public class PersonAgeComparator implements Comparator {

	public int compare(Object o1, Object o2) {

		Person p1 = (Person) o1;
		Person p2 = (Person) o2;

		//In this comparator, the comparison between 2 Person objects is done by 
		//comparing their age instead of their id (int natural order).
		if (p1.getAge() < p2.getAge()) {
			return -1;
		} else if (p1.getAge() > p2.getAge()) {
			return 1;
		} else {
			return 0;
		}

		//Another way of implementing the comparison according to the age attribute, is by
		//inboxing the age attributes, which are ints, to their wrapper class Integer and use the
		//'java.lang.Integer.compareTo(Integer)' method.
//		return Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p2.getAge()));
	}

}
