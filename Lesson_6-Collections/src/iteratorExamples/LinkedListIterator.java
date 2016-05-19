package iteratorExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIterator {

	public static void main(String[] args) {

		//LinkedList - Like ArrayList, but allows for constant-time complexity for insertions 
		//or removals using iterators and only sequential access of elements. In other words, 
		//you can walk the list forwards or backwards, but finding a position in the list takes 
		//time proportional to the size of the list.
		List list = new LinkedList();

		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 11);
			list.add(new Integer(r));
		}

		System.out.println(list);

		//Creating an Iterator for the LinkedList. An instance of a LinkedList iterator is returned.
		Iterator it = list.iterator();

		//Check if there are more elements in list.
		while (it.hasNext()) {
			//Get the next element pointed by the iterator.
			Object curr = it.next();

			if (curr.equals(new Integer(3)) || curr.equals(new Integer(7))) {
				//Remove the last retrieved element from list.
				it.remove();
			}
		}

		System.out.println(list);
	}

}
