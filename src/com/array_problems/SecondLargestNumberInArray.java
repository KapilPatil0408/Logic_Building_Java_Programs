package com.array_problems;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int a[] = { 2, 4, 5, 1, 8, 3, 9 };
		int largestNumber = Integer.MIN_VALUE;
		int secondLargetNumber = Integer.MIN_VALUE;

		for (int Number : a) {
			if (Number > largestNumber) {
				secondLargetNumber = largestNumber;
				largestNumber = Number;
			} else if (Number > secondLargetNumber && Number != largestNumber) {
				secondLargetNumber = Number;
			}
		}
		System.out.println("Second Larget Number:- "+ secondLargetNumber);
	}
}
