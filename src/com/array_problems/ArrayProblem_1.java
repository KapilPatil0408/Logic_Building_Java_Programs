package com.array_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProblem_1 {

	public static void main(String[] args) {
		
		int a[]= {1,2,7,3,4,2,4,7,6,8};
		
		Set<Integer> set= new HashSet<Integer>();
		
		Arrays.stream(a).forEach(num -> set.add(num));
		
		int evenNumberArray[]= set.stream().filter(n -> n % 2 == 0).mapToInt(Integer :: intValue).toArray();
		
		int oddNumberArray[]= set.stream().filter(n -> n % 2 != 0).mapToInt(Integer :: intValue).toArray();
		
		System.out.println(Arrays.toString(evenNumberArray));
		System.out.println(Arrays.toString(oddNumberArray));
	}

}
