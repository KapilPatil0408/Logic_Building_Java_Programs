package com.number_problems;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int copy= number;
		int lastDigit=0;
		int armstrongNumber=0;
		
		while(copy !=0) {
			lastDigit=copy % 10;
			armstrongNumber=armstrongNumber+lastDigit*lastDigit*lastDigit;
			copy= copy /10;
		}
		
		if(armstrongNumber==number) {
			System.out.println("Numnber is armstrong number");
		}else {
			System.out.println("Numnber is armstrong number");
		}
		
	}

}
