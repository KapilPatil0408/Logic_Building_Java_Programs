package com.array_problems;

public class LongestContinuousSubArray {

	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7 };
		int count = 1;
		int maxCount = 1;


			for (int j = 1; j < a.length; j++) {
				if (a[j] == a[j-1] + 1) {
					count++;
				}else {
					count =1;
				}
				maxCount= Math.max(maxCount, count);
			}

		System.out.println(maxCount);

	}

//	public static int findLogestConsecutiveSubArray(int[] a) {
//
//		int maxLen = 1;
//		int currentLen = 1;
//		
//		for(int i=1; i< a.length; i++) {
//			if(a[i] == a[i-1] + 1) {
//				currentLen++;
//			}else {
//				
//			}
//		}
//
//	}

}
