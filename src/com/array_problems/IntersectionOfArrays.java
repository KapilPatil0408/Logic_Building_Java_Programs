package com.array_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 1 };
		int b[] = { 2, 2 };

		Set<Integer> set1 = new HashSet();

		for (int no : a) {
			set1.add(no);
		}
		
		Set<Integer> resultSet= new HashSet();
		
		for(int num1:b) {
			if(set1.contains(num1)) {
				resultSet.add(num1);
			}
		}
		
		int result[]= new int[resultSet.size()];
		
		int index=0;
		for(int val:resultSet) {
			result[index]=val;
			index++;
		}
		System.out.println(Arrays.toString(result));
	}

}
