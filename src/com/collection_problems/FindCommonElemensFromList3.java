package com.collection_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElemensFromList3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("how");

		ArrayList<String> list1 = new ArrayList();
		list1.add("five");
		list1.add("four");
		list1.add("two");
		list1.add("how");

		Set<String> result = new HashSet<String>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (list.get(i).equalsIgnoreCase(list1.get(j))) {
					result.add(list.get(i));
				}
			}
		}
		System.out.println(result);
	}

}
