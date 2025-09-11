package com.collection_problems;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElemensFromList2 {

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
		
//		Set<String> result=list.stream().filter(list1::contains).collect(Collectors.toSet());
//		System.out.println(result);
		
		Set<String> result1=list.stream().filter(x -> list1.contains(x)).collect(Collectors.toSet());
		System.out.println(result1);
	}

}
