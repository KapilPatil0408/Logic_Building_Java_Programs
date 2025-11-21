package com.array_problems;

public class ReverseArraySolution2 {

	public static void main(String[] args) {
		int number[] = { 10, 20, 30, 40 };

		int left = 0;
		int right = number.length - 1;
		int temp;

		while (left < right) {
			temp = number[left];
			number[left] = number[right];
			number[right] = temp;

			left++;
			right--;
		}
		for(int input:number) {
			System.out.print(input+ " ");
		}

//		System.out.println(Arrays.toString(number));
	}

}
