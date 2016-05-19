package sortingListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingInteger {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		//Randomising int numbers and inboxing them to the wrapper class Integer
		//in order to add them to a List.
		for (int i = 0; i < 10; i++) {
			list.add(new Integer((int)(Math.random()*11)));
		}
		
		System.out.println(list);
		
		//Sorting the list of Integer objects using the sort(List) method that uses
		//the compareTo() method of the Integer class that implements Comparable.
		Collections.sort(list);

		System.out.println(list);
	}

}
