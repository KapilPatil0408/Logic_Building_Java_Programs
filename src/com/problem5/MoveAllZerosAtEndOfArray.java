package com.problem5;

public class MoveAllZerosAtEndOfArray {

	public static void main(String[] args) {
		int number[]= {0,2,0,7,6,0,0,5,6};

	//	int number[] = { 1, 0, 2, 0, 3, 0 };
		int temp;
		int putNonZeroValueHere = 0;

		for (int current = 0; current < number.length; current++) {
			if (number[current] !=0) {
				temp=number[putNonZeroValueHere];
				number[putNonZeroValueHere] = number[current];
				number[current] =temp;
				putNonZeroValueHere++;
			}
		}
		for(int element:number) {
			System.out.print(element+" ");
		}
	}
}
