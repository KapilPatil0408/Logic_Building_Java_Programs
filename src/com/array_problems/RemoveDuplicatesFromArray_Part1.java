package com.array_problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray_Part1 {

	public static void main(String[] args) {

		int a[]= {20,30,50,10,40,40,50};
		Set<Integer> dataSet= new LinkedHashSet<>();
		
		for(int i=0; i<a.length;i++) {
			dataSet.add(a[i]);
		}
		System.out.println(dataSet);   //--- > Objects of Integer class
		
		// to convert set into array Streams are used!!!
		
		int result[]=dataSet.stream().mapToInt(Integer::intValue).toArray();  // ---> result contains int values
		System.out.println(Arrays.toString(result));
	}
}

/*
* HashSet - order is not maintained.
* TreeSet - retrieve data in ascending order.
* LinkedHashSet- preserve order of data.
*/