package com.number_problems;

public class ReverseFirstLastDigit_Number_SB {

	public static void main(String[] args) {
		int num = 4567; // 7564
		int digit;
		int result =0;
		StringBuilder sb = new StringBuilder();

		while (num != 0) {
			digit = num % 10;
			if(digit == 7) {
				sb.append(digit);
			}else {
				sb.append(digit);
			}
			num = num / 10;
		}
		System.out.println(sb);
		
		for(int i=0; i< sb.length(); i++) {
			char c= sb.charAt(i);
			
			 if (c < '0' || c > '9') {
			        throw new NumberFormatException("Invalid digit: " + c);
			    }
			
			result = result * 10 + (c - '0');
			
		}
		
		System.out.println(result);
	}

}
