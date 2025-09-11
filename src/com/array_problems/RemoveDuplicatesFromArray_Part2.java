package com.array_problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray_Part2 {

	public static void main(String[] args) {

		int a[] = { 20, 30, 50, 10, 40, 40, 50 };
		System.out.println(Arrays.toString(a));
		a = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(a));
	}
}
