package com.array_problems;

import java.util.Arrays;

public class ReverseArrayToRight {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int left = 0;
		int right = a.length - 1;
		int n = 3;
		int k = n % a.length;

		System.out.println(Arrays.toString(a));

		reverseArray(a, left, right);
		reverseArray(a, left, k - 1);
		a = reverseArray(a, k, right);
		System.out.println(Arrays.toString(a));

	}

	private static int[] reverseArray(int[] a, int left, int right) {

		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		return a;
	}
}
