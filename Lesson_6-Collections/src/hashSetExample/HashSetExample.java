package hashSetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		//Set - Unordered group, duplicates are forbidden.
		Set set = new HashSet();

		set.add("Sunday");
		set.add("Monday");
		set.add("Monday"); //Duplicated Monday forbidden. Will not be added to the collection.
		set.add("Tuesday");

		System.out.println(set); //"[Monday, Sunday, Tuesday]" is printed.


		set = new HashSet();

		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);

			//A collection cannot hold primitive types, only objects. So in order
			//to store the int 'r' it necessary to do INBOXING to the Integer wrapper class.
			set.add(new Integer(r));
		}

		System.out.println(set);
	}
}
