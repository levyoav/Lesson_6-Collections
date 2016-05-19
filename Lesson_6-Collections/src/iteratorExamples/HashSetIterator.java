package iteratorExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {

	public static void main(String[] args) {

		//Set - Unordered group, duplicates are forbidden.
		Set set = new HashSet();

		set.add("Sunday");
		set.add("Monday");
		set.add("Bad Day");
		set.add("Monday"); //Duplicated Monday forbidden. Will not be added to the collection.
		set.add("Tuesday");

		//Creating an Iterator for the HashSet. An instance of a HashSet iterator is returned.
		Iterator it = set.iterator();

		//Check if there are more elements in set.
		while(it.hasNext()) {
			//Get the next element pointed by the iterator.
			Object curr = it.next();

			System.out.println(curr);

			if(curr.equals("Bad Day")) {
				//Remove the last retrieved element from set.
				it.remove();
			}
		}

		System.out.println(set); //'[Monday, Sunday, Tuesday]' is printed.

	}
}
