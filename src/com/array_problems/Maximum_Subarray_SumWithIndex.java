package com.array_problems;

public class Maximum_Subarray_SumWithIndex {

	public static void main(String[] args) {

		int a[] = { 2, 3, -8, 7, -1, 2, 3 };
		int b[] = { -2, -4 };
		int[] c = {5, -1, 2, -1, 3, -2, 3};
		maxSubArraySumWithElement(a);
		maxSubArraySumWithElement(b);
		maxSubArraySumWithElement(c);
	}

	public static void maxSubArraySumWithElement(int[] a) {

		int maxSum = a[0];
		int currentSum = a[0];

		int start = 0;
		int end = 0;
		int tempStart = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > currentSum + a[i]) {
				currentSum = a[i];
				tempStart = i;

			} else {
				currentSum += a[i];
			}

			if (currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart;
				end = i;
			}

		}
		// Print results
		System.out.println("Maximum Subarray Sum: " + maxSum);
		System.out.print("Subarray Elements: ");
		for (int i = start; i <= end; i++) {
			System.out.print(a[i] + " ");
		}
		 System.out.println();
	}
}
