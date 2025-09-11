package com.string_problems;

public class String_SumOfNumbers {

	public static void main(String[] args) {
		String input= "12abc34xyz56lmn10";
		char inputArray[]= input.toCharArray();
		StringBuilder sb= new StringBuilder();
		int sum=0;
		
		for(char c: inputArray) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}else {
				if(sb.length()>0) {
				sum=sum+Integer.parseInt(sb.toString());
				sb.setLength(0);
				}
			}
		}
		
		if(sb.length()>0) {
			sum=sum+Integer.parseInt(sb.toString());
			}
		System.out.println(sum);

	}

}
