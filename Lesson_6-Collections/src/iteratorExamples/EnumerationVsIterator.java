package iteratorExamples;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class EnumerationVsIterator {

	public static void main(String[] args) {

		Hashtable map = new Hashtable();

		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");

		//A primitive version of iterator (not commonly used).
		Enumeration en = map.keys();

		//Check if there are still more elements to extract (true), or if all the 
		//elements have been enumerated (false).
		while (en.hasMoreElements()) {
			//Returns the next object in the enumeration as a generic Object reference.
			System.out.println(en.nextElement());
		}

		System.out.println("===========");

		//Returns an iterator of the set of the keys of the Hashtable.
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
