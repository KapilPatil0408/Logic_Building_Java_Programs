package com.number_problems;

public class EvenOddNumberBitwiseOperator {

	public static void main(String[] args) {
		
		int num=46;
		
		if((num & 1) == 1) {
			System.out.println("Number is odd");
		}else {
			System.out.println("Number is even");
		}

	}

}
