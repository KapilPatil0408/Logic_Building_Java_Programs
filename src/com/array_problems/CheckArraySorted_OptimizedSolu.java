package com.array_problems;

public class CheckArraySorted_OptimizedSolu {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(chcekArrayIsSorted(arr1));

	}

	public static String chcekArrayIsSorted(int a[]) {

		if (a.length == 1)
			return "Sorted as array is having single element.";

		int i = 1;

		while (i < a.length && a[i] == a[i - 1])
			i++;

		if (i == a.length)
			return "Sorted as all element in array are same.";

		Boolean ascending = a[i] > a[i - 1];

		for (; i < a.length; i++) {
			if (ascending && a[i] < a[i - 1])
				return "Not sorted";
			if (!ascending && a[i] > a[i - 1])
				return "Not sorted";
		}
		return ascending ? "Array is sorted in ascending order." : "Array is sorted in descending order.";
	}

}
