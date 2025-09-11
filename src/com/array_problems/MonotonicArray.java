package com.array_problems;

public class MonotonicArray {

	public static void main(String[] args) {
		// if the elements in the array are either increasing or decreasing

		int[] a = { 3, 4, 5, -6, 7 };
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				decreasing = false;
			} else if (a[i - 1] > a[i]) {
				increasing = false;
			}
		}
		if(increasing || decreasing) {
			System.out.println("Given array is monotonic");
		}else {
			System.out.println("Given array is not monotonic");
		}
	}

}
