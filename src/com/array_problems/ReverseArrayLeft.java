package com.array_problems;

import java.util.Arrays;

public class ReverseArrayLeft {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int left = 0;
		int right = a.length - 1;
		int n = 2;
		int k = n % a.length;

		reverseArray(a, left, k - 1); // reverse first k elements 0,1 indexes
		reverseArray(a, k, right); // reverse the remaining elements of array
		a = reverseArray(a, left, right);
		System.out.println(Arrays.toString(a)); // reverse whole array

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
