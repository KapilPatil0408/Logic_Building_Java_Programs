package com.collection_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueElementFromList {
	
	public static void findLonerInteger(List<Integer> input) { //1,1,2,2,3,3,4,4,5
		 
		 Map<Integer, Integer> map= new LinkedHashMap<Integer, Integer>();
		 
		 for(int num: input) {
			 map.put(num, map.getOrDefault(num, 0) + 1);
		 }
		 
		 for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			 if(entry.getValue() == 1) {
				 System.out.println(entry.getKey());
			 }
		 }
	 }
	 
	 
	 public static void main(String[] args) {
	        List<List<Integer>> input = new ArrayList<>();
	        input.add(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 9, 99, 99));
	        input.add(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 6, 7, 8, 9));
	        input.add(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11));
	        input.add(Arrays.asList(1, 1, 2, 2, 3));
	        for (List<Integer> current: input) {
	            System.out.println("Input: " + current);
	            System.out.println("Size: " + current.size());
	            findLonerInteger(current);
	        }
	    }
}
