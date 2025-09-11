package com.collection_problems;

import java.util.ArrayList;

public class FindCommonElemensFromList {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList();
		list.add("one");
		list.add("two");
		list.add("how");
		
		ArrayList<String> list1= new ArrayList();
		list1.add("five");
		list1.add("four");
		list1.add("two");
		list1.add("how");
		
		list.retainAll(list1);
		System.out.println(list);
	}

}
