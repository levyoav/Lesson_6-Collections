package com.jbt.a.implementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListHashSetLinkedHashMap {

	public static void main(String[] args) {

		// Targil 1
		List list = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 11);

			//A collection cannot hold primitive types, only objects. So in order
			//to store the int 'r' it necessary to do INBOXING to the Integer wrapper class.
			list.add(new Integer(r));
		}

		System.out.println(list);

		// Targil 2
		Set set = new HashSet();

		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);
			set.add(new Integer(r));
		}

		System.out.println(set);

		// Targil 3

		//LinkedHashMap will iterate over its elements in the order they were put into it.
		Map map = new LinkedHashMap();

		//char is actually a SHORT INTEGER that is being interpreted as a Unicode symbol.
		//Arithmetic operations are allowed on it.
		for (char c = 'A'; c <= 'Z'; c++) {
			//Associated the ASCII value of a character to the character as a key. 
			map.put(new Character(c), new Integer(c));
		}

		System.out.println(map);
	}
}
