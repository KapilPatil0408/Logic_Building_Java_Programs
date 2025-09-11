package com.array_problems;

public class MountainArray {

	public static void main(String[] args) {
		// int a[] = { 1, 3, 5, 10, 4, 2, 0 };
		int a[] = { 6, 13, 15, 20, 14, 12, 10, 5 };
		boolean result = checkMountainArray(a);
		System.out.println(result);
	}

	public static boolean checkMountainArray(int a[]) {

		// 1. length must be greater than 2

		if (a.length < 3) {
			return false;
		}

		int i = 0;

		// 2. Elements must be increasing order
		while ((i + 1 < a.length) && (a[i] < a[i + 1])) {
			i++;
		}

		while ((i + 1 < a.length) && (a[i] > a[i + 1])) {
			i++;
		}

		return a.length - 1 == i;
	}
}
