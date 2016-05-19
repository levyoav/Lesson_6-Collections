package arrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		//List - Ordered group, duplicates are permitted.
		List list = new ArrayList();

		list.add("Sunday");
		list.add("Monday");
		list.add("Monday"); //Duplicated Monday allowed.
		list.add("Tuesday");

		System.out.println(list); //"[Sunday, Monday, Monday, Tuesday]" is printed.


		list = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 11);

			//A collection cannot hold primitive types, only objects. So in order
			//to store the int 'r' it necessary to do INBOXING to the Integer wrapper class.
			list.add(new Integer(r));
		}

		System.out.println(list);
	}
}
