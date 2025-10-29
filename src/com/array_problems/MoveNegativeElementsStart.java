package com.array_problems;

import java.util.Arrays;

public class MoveNegativeElementsStart {

	public static void main(String[] args) {

		int a[] = { 4, 7, 0, -1, 0, 4, -3, -2 };

		int putNegativeNumberAt = 0;

		for (int current = 0; current < a.length; current++) {
			if (a[current] < 0) {
				int temp = a[current];
				a[current] = a[putNegativeNumberAt];
				a[putNegativeNumberAt] = temp;
				putNegativeNumberAt++;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
