package sortingListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparableExample.Person;
import comparatorExample.PersonAgeComparator;
import comparatorExample.PersonNameComparator;

public class SortingObjects {

	public static void main(String[] args) {

		//Duplicates are allowed in ArratList.
		List persons = new ArrayList();

		persons.add(new Person(3, "ccc", 17));
		persons.add(new Person(1, "aaa", 23));
		persons.add(new Person(200, "eee", 5));
		persons.add(new Person(100, "zzz", 46));

		//Setting lowId to be the lowest possible value of Integer. 
		int lowId = Integer.MIN_VALUE;

		//Adding a Person object with both name and age that are identical to the 
		//last object's name and age.
		persons.add(new Person(lowId, "zzz", 46));

		//Adding a Person object IDENTICAL (all attributes are equal) to the last object in the list.
		persons.add(new Person(100, "zzz", 46));

		System.out.println(persons);

		//Sorting the list using the sort(List) method that uses the compareTo() method of the Person
		//class that implements Comparable. If the Person class would not have implemented Comparable and
		//override the compareTo() method, invoking 'Collections.sort(list)' will throw a ClassCastException
		//that is a runtime exception. The object of the list must all be of type of class that implements
		//Comparable and overrides the compareTo() method.
		Collections.sort(persons);

		System.out.println(persons);

		//Sorting the list by age using the sort(List, Comparator) method that uses the compare() method in the
		//comparator class PersonAgeComparator. This kind of sorting dosen't obligates the objects in the list to be
		//of class type that implements Comparable and overrides the compareTo() method, since the method that is actualy
		//being used is compare() in the comparator class.
		Collections.sort(persons, new PersonAgeComparator());
		System.out.println(persons);

		//Sorting by name in the same way as describes above.
		Collections.sort(persons, new PersonNameComparator());
		System.out.println(persons);

	}

}
