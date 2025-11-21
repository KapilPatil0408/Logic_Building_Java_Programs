package com.array_problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public static void main(String[] args) {
		
		int a[] = { 2, 5, 12, 8, 7};
		int target = 9;
		
		int result[]=calculate(a, target);
		System.out.println(result[0]+" "+result[1]);

	}

	private static int[] calculate(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			int complement = target - a[i];
			if (map.containsKey(complement)) {
				int input[] = { map.get(complement), i };
				return input;
			}
			map.put(a[i], i);
		}
		return null;
	}
}
