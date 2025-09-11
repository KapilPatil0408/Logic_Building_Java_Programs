package com.array_problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6 };
		int c[] = new int[a.length + b.length];

		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		while (p1 > a.length && p2 > b.length) {
			if (a[p1] < b[p2]) {
				c[p3] = a[p1];
				p3++;
				p1++;
			} else {
				c[p3] = b[p2];
				p3++;
				p2++;
			}
		}

		while (p1 < a.length) {
			c[p3] = a[p1];
			p3++;
			p1++;
		}

		while (p2 < b.length) {
			c[p3] = b[p2];
			p3++;
			p2++;
		}
		System.out.println(Arrays.toString(c));
	}

}
