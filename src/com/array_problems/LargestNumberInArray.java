package com.array_problems;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int number[]= {10,20,30,40,60,50};
		
		int largestNumber=number[0];
		
		for(int i=1; i<number.length;i++) {
			if(number[i]>largestNumber) {
				largestNumber=number[i];
			}
		}
		System.out.println("Largest number:- "+largestNumber);

	}

}
