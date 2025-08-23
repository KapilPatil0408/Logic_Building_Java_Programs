package com.problem5;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int num=-Integer.MIN_VALUE;
		int reverseNum=0;
		int lastDigit;
		
		while(num != 0) {
			lastDigit=num%10;
			//check for overflow
			if(reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE /10 && lastDigit >7)) {
				System.out.println(0);
				System.exit(0);
			}
			if(reverseNum < Integer.MIN_VALUE / 10 || (reverseNum ==Integer.MIN_VALUE /10 && lastDigit <-8)) {
				System.out.println(0);
				System.exit(0); // underflow conditon
			}
			
			reverseNum=reverseNum*10 + lastDigit;
			num=num/10;
		}
		System.out.println("Number after reversing is= "+reverseNum);

	}

}
