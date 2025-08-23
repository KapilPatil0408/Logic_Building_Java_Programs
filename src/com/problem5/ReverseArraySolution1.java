package com.problem5;

import java.util.Arrays;

public class ReverseArraySolution1 {

	public static void main(String[] args) {
		int number[] = { 10, 20, 30, 40 };

		int numberReverseArray[] = new int[number.length];
		int reverseIndex = 0;

		for (int i = number.length - 1; i >= 0; i--) {
			numberReverseArray[reverseIndex] = number[i];
			reverseIndex++;
		}
		number = numberReverseArray;
	//	System.out.println(Arrays.toString(numberReverseArray));
		System.out.println(Arrays.toString(number));
	}
}
