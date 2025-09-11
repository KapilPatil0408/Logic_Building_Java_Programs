package com.array_problems;

public class LeaderInArray {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };
		int maxRight = a[a.length - 1];
		System.out.print(maxRight+" ");

		for (int i = a.length-2; i>=0 ; i--) {
			if (a[i] > maxRight) {
				maxRight = a[i];
				System.out.print(maxRight + " ");
			}

		}
	}

}
