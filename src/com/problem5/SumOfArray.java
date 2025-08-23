package com.problem5;

public class SumOfArray {

	public static void main(String[] args) {

		int numbers[] = { 1, 24, 33, 44 };
		int sumOfArray = 0;

		for (int no : numbers) {
			sumOfArray = sumOfArray + no;
		}
		System.out.println(sumOfArray);

	}

}
