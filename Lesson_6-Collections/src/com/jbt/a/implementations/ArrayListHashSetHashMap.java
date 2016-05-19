package com.jbt.a.implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListHashSetHashMap {

	public static void main(String[] args) {

		//List - Ordered group, duplicates are permitted.
		List list = new ArrayList();

		list.add("Sunday");
		list.add("Monday");
		list.add("Monday"); //Duplicated Monday allowed.
		list.add("Tuesday");

		System.out.println(list); //"[Sunday, Monday, Monday, Tuesday]" is printed.

		//Set - Unordered group, duplicates are forbidden.
		Set set = new HashSet();

		set.add("Sunday");
		set.add("Monday");
		set.add("Monday"); //Duplicated Monday forbidden. Will not be added to the collection.
		set.add("Tuesday");

		System.out.println(set); //"[Monday, Sunday, Tuesday]" is printed.

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

	}

}
