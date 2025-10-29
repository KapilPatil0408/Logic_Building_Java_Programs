package com.array_problems;

public class CheckArraySorted {

	public static void main(String[] args) {
		int[] arr1 = {5,4,6,3,2,1};
		chcekArrayIsSorted(arr1);

	}

	public static void chcekArrayIsSorted(int a[]) {
		Boolean isAscending = true, isDescending = true;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				isDescending = false;
			}
			if (a[i - 1] > a[i]) {
				isAscending = false;
			}
		}
		if (isDescending || isAscending) {
			if(!isDescending && isAscending) {
				System.out.println("Array is sorted in ascending order");
			} else if(isDescending && !isAscending){
				System.out.println("Array is sorted in descending order");
			}
		}else {
			System.out.println("Array is not sorted");
		}
	}

}
