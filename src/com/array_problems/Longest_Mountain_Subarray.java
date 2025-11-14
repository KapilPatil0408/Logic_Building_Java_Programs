package com.array_problems;

public class Longest_Mountain_Subarray {

	public static void main(String[] args) {

		int a[] = { 2, 1, 4, 7, 3, 2, 5 };
		int length= length_LongestMountain_Subarray(a);
		System.out.println(length);

	}

	public static int length_LongestMountain_Subarray(int[] a) {
		int i = 0;
		int maxLength = 0;

		while (i + 1 < a.length) {
			int len = 1;
			while (i + 1 < a.length && a[i] < a[i + 1]) {
				i++;
				len++;
			}

			boolean hasDecreasing = false;
			while (i + 1 < a.length && a[i] > a[i + 1]) {
				i++;
				len++;
				hasDecreasing = true;
			}

			if (hasDecreasing) {
				maxLength = Math.max(maxLength, len);
			}

			while (i + 1 < a.length && a[i] == a[i + 1]) {
				i++;
			}

		}
		return maxLength;
	}
	
	
}
