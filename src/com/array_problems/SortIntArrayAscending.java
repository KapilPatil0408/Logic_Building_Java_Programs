package com.array_problems;

import java.util.Arrays;

public class SortIntArrayAscending {

	public static void main(String[] args) {
		int a[] = { 8, 1, 7, 2, 6, 3, 5, 4 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
