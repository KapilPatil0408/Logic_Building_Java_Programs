package com.array_problems;

import java.util.Arrays;

public class MaxProductOfTriplet {

	public static void main(String[] args) {

		int a[] = { -10, -3, 5, 6, -20 };

		int n = a.length;

		if (n < 3) {
			System.err.println("Minimum number of elements in array shuld be 3.");
			System.exit(0);
		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int resultOne = a[n - 1] * a[n - 2] * a[n - 3];

		int resultTwo = a[n - 1] * a[0] * a[1];

		int result = Math.max(resultOne, resultTwo);
		System.out.println("Max product of Triplet = " + result);

	}
}
