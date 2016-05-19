package hashMapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		//HashMap - Unordered group of key-value pairs.
		Map map = new HashMap();

		//put(key, value) method:
		//key - key with which the specified value is to be associated 
		//value - value to be associated with the specified key 
		map.put("One", new Integer(1)); //The Integer 1 is associated with the key "One".
		map.put("Two", new Integer(2));
		map.put("Three", new Integer(3));
		map.put("Four", new Integer(4));
		map.put("Five", new Integer(5));

		System.out.println(map); //"{Five=5, One=1, Four=4, Two=2, Three=3}" is printed.


		//LinkedHashMap will iterate over its elements in the order they were put into it.
		map = new LinkedHashMap();

		//char is actually a SHORT INTEGER that is being interpreted as a Unicode symbol.
		//Arithmetic operations are allowed on it.
		for (char c = 'A'; c <= 'Z'; c++) {
			//Associated the ASCII value of a character to the character as a key. 
			map.put(new Character(c), new Integer(c));
		}

		System.out.println(map);
	}
}
