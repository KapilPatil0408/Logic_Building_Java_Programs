package com.number_problems;

public class ReverseFirstLastDigit_Number {

	public static void main(String[] args) {
		
		int num = 4567;
		int last= num % 10;
		
		
		int originalNum =num;
		int first=0;
		int divisor =1;
		
		while(num >= 10) {
			num = num /10;
			divisor = divisor * 10;
		}
		first = num;
		
		int middle = (originalNum % divisor) /10;
		
		int swapped = last * divisor + middle * 10 + first;
		
		System.out.println("Number after swapping:- "+ swapped);

	}

}
