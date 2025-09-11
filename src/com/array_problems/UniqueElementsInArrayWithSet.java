package com.array_problems;

import java.util.HashSet;

public class UniqueElementsInArrayWithSet {
	
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 1, 2 };
		HashSet<Integer> seen = new HashSet();
		HashSet<Integer> duplicates = new HashSet();

		for (int c : a) {
			if (!(seen.add(c))) {
				duplicates.add(c);
			}
		}
		System.out.println("Seen Set: "+seen);
		System.out.println("Duplicate set: "+duplicates);
		seen.removeAll(duplicates); 
		System.out.println(seen);
	}
}
