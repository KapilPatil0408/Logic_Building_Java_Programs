package com.array_problems;

public class ArrayProblem {

	public static void main(String[] args) {

		int a[] = { 4, 5, 8, 10, 15, 12, 9 };
		int index = findIndexOrClosestGreater(a, 11);
		
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Index: "+ index + ", value: "+ a[index]);
		}

	}

	public static int findIndexOrClosestGreater(int[] arr, int key) {
		int closeIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}else if(arr[i] > key) {
				if(closeIndex ==-1 || arr[i] < arr[closeIndex]) {
					closeIndex = i;
				}
			}
		}
		return closeIndex;
	}
}
