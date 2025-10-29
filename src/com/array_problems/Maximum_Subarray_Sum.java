package com.array_problems;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {

		int a[] = { 2, 3, -8, 7, -1, 2, 3 };
		int b[] = { -2, -4 };
		int result = maxSubArraySum(a);
		System.out.println(result);
		int result1 = maxSubArraySum(b);
		System.out.println(result1);
	}

	public static int maxSubArraySum(int[] a) {

		int maxSum = a[0];

		for (int i = 0; i < a.length; i++) {
			int currentSum = 0;
			for (int j = i; j < a.length; j++) {
				currentSum += a[j];
				maxSum = Math.max(maxSum, currentSum);
			}
		}
		return maxSum;
	}

}
