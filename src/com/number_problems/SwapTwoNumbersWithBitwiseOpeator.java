package com.number_problems;

public class SwapTwoNumbersWithBitwiseOpeator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a^b;
		b=b^a;
		a=a^b;
		
		System.out.println("a "+a);
		System.out.println("b= "+b);

	}

}
